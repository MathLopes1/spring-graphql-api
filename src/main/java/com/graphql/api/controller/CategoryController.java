package com.graphql.api.controller;

import com.graphql.api.domain.Category;
import com.graphql.api.dto.CategoryDTO;
import com.graphql.api.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.Optional;
import java.util.UUID;

@Controller
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @MutationMapping()
    Category createCategory(@Argument CategoryDTO category) {
        Category categorySaved = categoryService.createCategory(category);
        return categorySaved;
    }

    @QueryMapping()
    Optional<Category> findCategoryById(@Argument UUID id) {
        var category = categoryService.findCategoryById(id);
        return category;
    }
}
