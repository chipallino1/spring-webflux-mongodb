package com.example.springwebfluxmongodb.data;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Document
public class User {
    private UUID id;
    private String userName;
    private String email;
    private String phoneNumber;
}
