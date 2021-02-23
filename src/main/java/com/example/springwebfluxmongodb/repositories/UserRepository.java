package com.example.springwebfluxmongodb.repositories;

import com.example.springwebfluxmongodb.data.User;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepository extends ReactiveCrudRepository<User, UUID> {
}
