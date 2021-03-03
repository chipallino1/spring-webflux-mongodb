package com.example.springwebfluxmongodb.services;

import com.example.springwebfluxmongodb.data.User;
import com.example.springwebfluxmongodb.dto.UserDto;
import com.example.springwebfluxmongodb.repositories.UserRepository;
import org.modelmapper.Conditions;
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
    public Mono<UserDto> createUser(UserDto userDto) {
        return Mono.just(userDto).map(this::mapToEntity).flatMap(userRepository::save).map(this::mapToDto);
    }

    @Override
    public Mono<UserDto> updateUser(UserDto userDto) {
        return Mono.just(userDto.getId())
                .flatMap(userRepository::findById)
                .map(user -> {
                    ModelMapper mapper = new ModelMapper();
                    mapper.getConfiguration().setPropertyCondition(Conditions.isNotNull());
                    mapper.map(userDto, user);
                    return user;
                })
                .flatMap(userRepository::save)
                .map(this::mapToDto);
    }

    @Override
    public Flux<UserDto> findAll() {
        return userRepository.findAll().map(this::mapToDto);
    }

    @Override
    public Flux<UserDto> findAllByUserName(String userName) {
        return userRepository.findAllByUserNameIsLike(userName).map(this::mapToDto);
    }

    @Override
    public Mono<UserDto> findById(String id) {
        return userRepository.findById(id).map(this::mapToDto);
    }

    @Override
    public Mono<Void> delete(String id) {
        return userRepository.deleteById(id);
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
