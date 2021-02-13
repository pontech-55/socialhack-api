package com.example.socialhackapi.model;

import org.springframework.data.annotation.Id;

public class Donations {
    @Id
    private long id;
    private String donation;
}
