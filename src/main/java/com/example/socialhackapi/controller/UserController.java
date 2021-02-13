package com.example.socialhackapi.controller;

import com.example.socialhackapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/authentication/register")
    public ResponseEntity<String> register(
            @RequestParam(value = "username") String username,
            @RequestParam(value = "email") String email,
            @RequestParam(value = "password") String password,
            @RequestParam(value = "isEntity") Boolean isEntity) {
        return new ResponseEntity<>(userService.register(username, email, password, isEntity), HttpStatus.OK);
    }

    @GetMapping("/authentication/login")
    public ResponseEntity<String> login(
            @RequestParam(value = "email") String email,
            @RequestParam(value = "password") String password) {
        return new ResponseEntity<>(userService.login(email, password), HttpStatus.OK);
    }
}