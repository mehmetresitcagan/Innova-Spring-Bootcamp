package com.example.dbapp.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dbapp.model.entity.Category;
import com.example.dbapp.repository.CategoryRepository;
import com.example.dbapp.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public List<Category> getAllCategories() {

        List<Category> findAll = categoryRepository.findAll();

        return findAll;
    }

    @Override
    public boolean deleteCategoryById(int categoryId) {
        if (existCategoryById(categoryId)) {
            categoryRepository.deleteById(categoryId);
            return true;
        }
        return false;
    }

    @Override
    public Category getCategoryById(int categoryId) {
        Optional<Category> optional = categoryRepository.findById(categoryId);
        if (optional.isPresent()) {
            Category category = optional.get();
            return category;
        }

        return null;
    }

    @Override
    public int addCategory(Category category) {
        categoryRepository.save(category);
        return category.getId();
    }

    @Override
    public Category updateCategory(Category categoryParam) {
        boolean existsCategoryById = existCategoryById(categoryParam.getId())
        if(existsCategoryById){
            Category categoryEntity = getCategoryById(categoryParam.getId());

        }
    
    
    }

    @Override
    public List<Category> searchCategoryByName(String categoryName) {

    }

    @Override
    public boolean existCategoryById(int categoryId) {
        boolean existsById = categoryRepository.existsById(categoryId);
        return existsById;
    }

}
