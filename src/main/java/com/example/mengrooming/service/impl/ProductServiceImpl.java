package com.example.mengrooming.service.impl;

import com.example.mengrooming.entity.Category;
import com.example.mengrooming.entity.Product;
import com.example.mengrooming.exception.ResourceNotFoundException;
import com.example.mengrooming.payload.ProductDto;
import com.example.mengrooming.repository.CategoryRepository;
import com.example.mengrooming.repository.ProductRepository;
import com.example.mengrooming.service.ProductService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author Chhin_Hua - 12/05
 **/

@Service
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;
    private final ModelMapper modelMapper;

    public ProductServiceImpl(ProductRepository productRepository, CategoryRepository categoryRepository, ModelMapper modelMapper) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<ProductDto> getAllProducts() {
        List<Product> products = productRepository.findAll();

        return products
                .stream()
                .map(product-> modelMapper.map(product, ProductDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public ProductDto addProduct(ProductDto productDto) {
        Category category = categoryRepository.findById(productDto.getCategoryId())
                .orElseThrow(() -> new ResourceNotFoundException("Category", "id", productDto.getCategoryId()));

        Product product = modelMapper.map(productDto, Product.class);
        product.setCategory(category);

        Product newProduct = productRepository.save(product);

        // convert entity to DTO and return
        return modelMapper.map(newProduct, ProductDto.class);
    }

    @Override
    public ProductDto getProductById(long id) {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Product", "id", id));
        return modelMapper.map(product, ProductDto.class);
    }

    @Override
    public ProductDto deleteProductById(long id) {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Product", "id", id));
        productRepository.deleteById(id);

        return modelMapper.map(product, ProductDto.class);
    }
}
