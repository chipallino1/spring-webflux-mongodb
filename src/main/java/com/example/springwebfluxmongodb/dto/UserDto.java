package com.example.springwebfluxmongodb.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserDto implements Serializable {
    private String id;
    private String userName;
    private String firstName;
    private String email;
    private String phoneNumber;
}
