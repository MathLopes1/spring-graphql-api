package com.graphql.api.services;

import com.graphql.api.domain.Category;
import com.graphql.api.dto.CategoryDTO;

import java.util.Optional;
import java.util.UUID;

public interface CategoryService {
    Category createCategory(CategoryDTO category);

    Optional<Category> findCategoryById(UUID id);
}
