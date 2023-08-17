package com.example.dbapp.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
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

        List<Category> categoryList = categoryRepository.findAll();
        return categoryList;
    }

    @Override
    public Category getCategoryById(int category_Id) {
        Optional<Category> opetionalCategory = categoryRepository.findById(category_Id);
        if (opetionalCategory.isPresent()) {
            Category category = opetionalCategory.get();
            return category;
        }
        return null;
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
    public int addCategory(Category category) {
        categoryRepository.save(category);
        return category.getId();
    }

    @Override
    public Category updateCategory(Category categoryParam) {
        boolean existCategoryById = existCategoryById(categoryParam.getId());
        if (existCategoryById) {
            Category categoryEntity = getCategoryById(categoryParam.getId());
            categoryEntity.setName(categoryParam.getName());
            categoryRepository.save(categoryEntity);
            return categoryEntity;
        }

        return null;
    }

    @Override
    public List<Category> searchCategoryByName(String categoryName) {
        List<Category> categoryList = categoryRepository.findByName(categoryName);
        return categoryList;
    }

    @Override
    public boolean existCategoryById(int categoryId) {
        boolean existsById = categoryRepository.existsById(categoryId);
        return existsById;
    }

    @Override
    public List<Category> searchCategoryByName(String categoryName, int pageNo, int pageSize, Direction sortDirection,
            String sortProperty) {
        PageRequest pageable = PageRequest.of(pageNo, pageSize, Sort.by(sortDirection, sortProperty));
        List<Category> categoryList = categoryRepository.findByName(categoryName, pageable);
        return categoryList;
    }

}
