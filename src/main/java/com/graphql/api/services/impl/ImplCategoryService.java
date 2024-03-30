package com.graphql.api.services.impl;

import com.graphql.api.domain.Category;
import com.graphql.api.dto.CategoryDTO;
import com.graphql.api.repositories.CategoryRepository;
import com.graphql.api.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class ImplCategoryService implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public Category createCategory(CategoryDTO category) {
        Category categorySaved = categoryRepository.save(new Category(category.getName()));
        return categorySaved;
    }

    public Optional<Category> findCategoryById(@Argument UUID id) {
        Optional<Category> category = categoryRepository.findById(id);
        return category;
    }
}
