package com.example.dbapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dbapp.model.entity.Category;
import com.example.dbapp.service.CategoryService;

@RestController
@RequestMapping("api/categories")
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @GetMapping(value = "")
    public List<Category> getAllCategories() {
        return categoryService.getAllCategories();
    }

    @GetMapping(value = "/searchByName/{name}")
    public List<Category> searchByName(@PathVariable("name") String name) {
        List<Category> categoryList = categoryService.searchCategoryByName(name);
        return categoryList;
    }

}
