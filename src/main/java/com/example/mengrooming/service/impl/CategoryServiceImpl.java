package com.example.mengrooming.service.impl;

import com.example.mengrooming.entity.Category;
import com.example.mengrooming.payload.CategoryDto;
import com.example.mengrooming.repository.CategoryRepository;
import com.example.mengrooming.service.CategoryService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Chhin_Hua - 12/05
 **/

@Service
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;
    private final ModelMapper modelMapper;

    public CategoryServiceImpl(CategoryRepository categoryRepository, ModelMapper modelMapper) {
        this.categoryRepository = categoryRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<CategoryDto> getAllCategories() {
        List<Category> categories = categoryRepository.findAll();

        return categories
                .stream()
                .map((category) -> modelMapper.map(category, CategoryDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public CategoryDto addCategory(CategoryDto categoryDto) {
        Category category = modelMapper.map(categoryDto, Category.class);

        Category saveCategory = categoryRepository.save(category);

        return modelMapper.map(saveCategory, CategoryDto.class);
    }

    @Override
    public CategoryDto getCategoryById(long id) {
        return null;
    }

    @Override
    public CategoryDto updateCategoryById(CategoryDto productDto, long id) {
        return null;
    }

    @Override
    public CategoryDto deleteCategoryById(long id) {
        return null;
    }
}
