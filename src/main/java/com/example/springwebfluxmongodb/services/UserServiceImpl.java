package com.example.springwebfluxmongodb.services;

import com.example.springwebfluxmongodb.data.User;
import com.example.springwebfluxmongodb.dto.UserDto;
import com.example.springwebfluxmongodb.repositories.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Mono<UserDto> createUser(User user) {
        return userRepository.save(user).map(this::mapToDto);
    }

    @Override
    public Mono<UserDto> updateUser(String id, UserDto userDto) {
        return null;
    }

    @Override
    public Flux<UserDto> findAll() {
        return null;
    }

    @Override
    public Flux<UserDto> findAllByFirstName(String firstName) {
        return null;
    }

    @Override
    public Mono<UserDto> findById(String id) {
        return null;
    }

    @Override
    public Mono<String> delete(String id) {
        return null;
    }

    private UserDto mapToDto(User user) {
        UserDto userDto = new UserDto();
        new ModelMapper().map(user, userDto);
        return userDto;
    }

    private User mapToEntity(UserDto userDto) {
        User user = new User();
        new ModelMapper().map(userDto, user);
        return user;
    }
}
