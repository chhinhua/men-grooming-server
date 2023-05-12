package com.example.mengrooming.controller;

import com.example.mengrooming.entity.Product;
import com.example.mengrooming.payload.CategoryDto;
import com.example.mengrooming.payload.ProductDto;
import com.example.mengrooming.payload.ProductListWrapper;
import com.example.mengrooming.service.ProductService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Chhin_Hua - 12/05
 **/

@CrossOrigin("*")
@RestController
@RequestMapping("api/v1/products")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    private ResponseEntity<List<ProductDto>> getAll() {
        return new ResponseEntity<>(productService.getAllProducts(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    private ResponseEntity<ProductDto> getProduct(@PathVariable(name = "id") Long id) {
        return new ResponseEntity<>(productService.getProductById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<ProductDto> createProduct(@Valid @RequestBody ProductDto productDto) {
        ProductDto saveProduct = productService.addProduct(productDto);
        return new ResponseEntity<>(saveProduct, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    private ResponseEntity<ProductDto> deleteProduct(@PathVariable(name = "id") Long id) {
        return new ResponseEntity<>(productService.deleteProductById(id), HttpStatus.OK);
    }
}
