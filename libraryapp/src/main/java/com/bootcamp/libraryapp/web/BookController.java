package com.bootcamp.libraryapp.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.libraryapp.models.entities.Book;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("api/books")
public class BookController {

    @GetMapping(value = "")
    public String get() {
        return "get";
    }

    @GetMapping(value = "")
    public String findAll() {
        return "findAll";
    }

    @GetMapping(value = "find/{bookID}")
    public int findByID(@PathVariable int bookID) {
        return bookID;
    }

    @PostMapping(value = "add")
    public boolean postMethodName(@RequestBody Book entity) {
        System.out.println(entity.getId());
        System.out.println(entity.getName());
        return true;
    }

    @DeleteMapping(value = "delete/{bookId}")
    public int deleteUser(@PathVariable int bookId) {
        return bookId;
    }

    @PutMapping(value = "{bookId}")
    public String updateUser(@PathVariable int bookId) {

        return "update";
    }

    @PatchMapping(value = "{bookId}")
    public String updateSomeData(@PathVariable int bookId, @RequestBody Book entity) {
        return "patch";
    }

}
