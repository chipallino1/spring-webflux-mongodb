package com.example.springwebfluxmongodb.repositories;

import com.example.springwebfluxmongodb.data.User;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface UserRepository extends ReactiveCrudRepository<User, String> {
    Flux<User> findAllByUserNameIsLike(String userName);
}
