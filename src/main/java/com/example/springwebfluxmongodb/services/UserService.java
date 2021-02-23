package com.example.springwebfluxmongodb.services;

import com.example.springwebfluxmongodb.data.User;
import reactor.core.publisher.Mono;

public interface UserService {
    Mono<User> createUser(User user);
}
