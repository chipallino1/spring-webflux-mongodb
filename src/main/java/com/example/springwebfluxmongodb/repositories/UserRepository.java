package com.example.springwebfluxmongodb.repositories;

import com.example.springwebfluxmongodb.data.User;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface UserRepository extends ReactiveCrudRepository<User, String> {
}
