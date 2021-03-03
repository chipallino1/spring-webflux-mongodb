package com.example.springwebfluxmongodb.services;

import com.example.springwebfluxmongodb.dto.UserDto;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface UserService {
    Mono<UserDto> createUser(UserDto userDto);

    Mono<UserDto> updateUser(UserDto userDto);

    Flux<UserDto> findAll();

    Flux<UserDto> findAllByUserName(String userName);

    Mono<UserDto> findById(String id);

    Mono<Void> delete(String id);
}
