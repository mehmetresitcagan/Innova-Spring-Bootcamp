package com.example.dbapp.service;

import java.util.List;

import org.springframework.data.domain.Sort.Direction;

import com.example.dbapp.model.entity.Category;

public interface CategoryService {

    List<Category> getAllCategories();

    Category getCategoryById(int category_Id);

    boolean deleteCategoryById(int categoryId);

    boolean existCategoryById(int categoryId);

    int addCategory(Category category);

    Category updateCategory(Category category);

    List<Category> searchCategoryByName(String categoryName);

    List<Category> searchCategoryByName(String categoryName, int pageNo, int pageSize, Direction sortDirection,
            String sortProperty);

}
