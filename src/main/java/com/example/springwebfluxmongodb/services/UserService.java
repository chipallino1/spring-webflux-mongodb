package com.example.springwebfluxmongodb.services;

import com.example.springwebfluxmongodb.dto.UserDto;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface UserService {
    Mono<UserDto> createUser(UserDto userDto);

    Mono<UserDto> updateUser(UserDto userDto);

    Flux<UserDto> findAll();

    Flux<UserDto> findAllByFirstName(String firstName);

    Mono<UserDto> findById(String id);

    Mono<String> delete(String id);
}
