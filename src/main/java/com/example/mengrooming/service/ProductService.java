package com.example.mengrooming.service;

import com.example.mengrooming.payload.ProductDto;

import java.util.List;

public interface ProductService {
    List<ProductDto> getAllProducts();

    ProductDto addProduct(final ProductDto productDto);

    ProductDto getProductById(final long id);

    ProductDto deleteProductById(final long id);
}
