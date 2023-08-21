package com.btkakademi.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.btkakademi.login.dto.entity.UserInfo;
import com.btkakademi.login.service.UserService;

import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/user")
public class UserInfoController {

    @Autowired
    UserService userService;

    @PostMapping("/add")
    public ResponseEntity<Integer> addUser(@RequestBody UserInfo user) {
        return ResponseEntity.ok(userService.addUser(user));
    }

    @GetMapping("/all")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public String getAll() {
        return "Admin sayfası";
    }

    @GetMapping("/{id}")
    @PreAuthorize("hasAuthority('ROLE_USER')")
    public String getById(@PathVariable int id) {
        return "user sayfası";
    }
}
