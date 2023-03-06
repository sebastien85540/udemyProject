package com.sebastien.udemyproject.services;

import com.sebastien.udemyproject.entities.CategoryEntity;

import java.util.List;

public interface CategoryService {
    List<CategoryEntity> findCategories();
    CategoryEntity findCategoryById(Long categoryId);
    CategoryEntity saveCategory(CategoryEntity category);
    CategoryEntity updateCategory(CategoryEntity category);
    void deleteCategoryById(Long categoryId);
}
