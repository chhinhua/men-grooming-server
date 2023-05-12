package com.example.mengrooming.payload;

import com.fasterxml.jackson.annotation.JsonRootName;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Chhin_Hua - 12/05
 **/


@JsonRootName(value = "products")
public class ProductListWrapper {
    private List<ProductDto> products;

    public ProductListWrapper() {
        this.products = new ArrayList<>();
    }

    public List<ProductDto> getProducts() {
        return products;
    }

    public void setProducts(List<ProductDto> products) {
        this.products = products;
    }
}
