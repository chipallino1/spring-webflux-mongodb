package com.example.springwebfluxmongodb.services;

import com.example.springwebfluxmongodb.data.User;
import com.example.springwebfluxmongodb.repositories.UserRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Mono<User> createUser(User user) {
        return userRepository.save(user);
    }
}
