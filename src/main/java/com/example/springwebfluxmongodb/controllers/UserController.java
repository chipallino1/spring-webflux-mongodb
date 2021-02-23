package com.example.springwebfluxmongodb.controllers;

import com.example.springwebfluxmongodb.data.User;
import com.example.springwebfluxmongodb.services.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/create")
    public Mono<User> createUser(@RequestBody User user) {
        return userService.createUser(user);
    }
}
