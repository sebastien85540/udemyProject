package com.sebastien.udemyproject.controllers;

import com.sebastien.udemyproject.entities.CategoryEntity;
import com.sebastien.udemyproject.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
@CrossOrigin
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @GetMapping(value = "")
    public List<CategoryEntity> getCategories(){
        return categoryService.findCategories();
    }

    @GetMapping(value = "/{id}")
    public CategoryEntity getCategoryById(@PathVariable("id") Long categoryId){
        return categoryService.findCategoryById(categoryId);
    }

    @PostMapping("")
    public CategoryEntity addCategory(@RequestBody CategoryEntity category){
        return categoryService.saveCategory(category);
    }

    @PatchMapping("")
    public CategoryEntity updateCategory(@RequestBody CategoryEntity category){
        return categoryService.updateCategory(category);
    }

    @DeleteMapping("/{id}")
    public void deleteCategory(@PathVariable("id") Long categoryId){
        categoryService.deleteCategoryById(categoryId);
    }
}
