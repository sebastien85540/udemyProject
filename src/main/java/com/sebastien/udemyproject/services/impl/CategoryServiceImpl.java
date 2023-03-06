package com.sebastien.udemyproject.services.impl;

import com.sebastien.udemyproject.entities.CategoryEntity;
import com.sebastien.udemyproject.repositories.CategryRepository;
import com.sebastien.udemyproject.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategryRepository categoryRepository;

    @Override
    public List<CategoryEntity> findCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public CategoryEntity findCategoryById(Long categoryId) {
        return categoryRepository.findById(categoryId).get();
    }

    @Override
    public CategoryEntity saveCategory(CategoryEntity category) {
        return categoryRepository.save(category);
    }

    @Override
    public CategoryEntity updateCategory(CategoryEntity category) {
        return categoryRepository.save(category);
    }

    @Override
    public void deleteCategoryById(Long categoryId) {
        categoryRepository.deleteById(categoryId);
    }
}
