package com.example.springwebfluxmongodb.controllers;

import com.example.springwebfluxmongodb.services.UserService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
}
