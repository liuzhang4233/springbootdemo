package com.wxdemo.controllers;

import com.wxdemo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Login {

    @Autowired
    BookService bookService;
    @RequestMapping("/login")
    String login(){
        bookService.getBook();
        return "login";
    }
}
