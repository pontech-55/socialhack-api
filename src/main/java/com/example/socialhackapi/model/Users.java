package com.example.socialhackapi.model;

import org.springframework.data.annotation.Id;

public class Users {
    @Id
    private long id;
    private String username;
    private String email;
    private String hashedPassword;
}
