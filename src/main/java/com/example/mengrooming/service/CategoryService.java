package com.example.mengrooming.service;

import com.example.mengrooming.payload.CategoryDto;
import com.example.mengrooming.payload.ProductDto;

import java.util.List;

public interface CategoryService {
    List<CategoryDto> getAllCategories();

    CategoryDto getCategoryById(final long id);

    CategoryDto addCategory(final CategoryDto categoryDto);

    CategoryDto updateCategoryById(final CategoryDto productDto, final long id);

    CategoryDto deleteCategoryById(final long id);

}
