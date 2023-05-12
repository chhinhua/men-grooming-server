package com.example.mengrooming.service;

import com.example.mengrooming.payload.CategoryDto;

import java.util.List;

public interface CategoryService {
    List<CategoryDto> getAllCategories();

    CategoryDto addCategory(final CategoryDto categoryDto);
}
