package com.example.springwebfluxmongodb.data;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class User {
    @Id
    private String id;
    private String userName;
    private String email;
    private String phoneNumber;
}
