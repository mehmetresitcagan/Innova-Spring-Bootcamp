package com.example.dbapp.service;

import java.util.List;

import com.example.dbapp.model.entity.Category;

public interface CategoryService {
    List<Category> getAllCategories();

    Category getCategoryById(int categoryId);

    boolean deleteCategoryById(int categoryId);

    int addCategory(Category category);

    Category updateCategory(Category category);

    List<Category> searchCategoryByName(String categoryName);

    boolean existCategoryById(int categoryId);
}
