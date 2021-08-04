package com.todo.practice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
public class UserController {
    @RequestMapping("/")
    public String show()
    {
        System.out.println("Hello");
        return "Hello";

    }
}
