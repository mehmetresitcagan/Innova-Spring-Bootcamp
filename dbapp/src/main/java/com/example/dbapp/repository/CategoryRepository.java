package com.example.dbapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.dbapp.model.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
