package com.example.socialhackapi.controller;

import com.example.socialhackapi.service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController {

    private final AuthenticationService authenticationService;

    @Autowired
    public AuthenticationController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @GetMapping("/hello")
    public String hello() {
        return authenticationService.hello();
    }

    @GetMapping("/register")
    public String login() {
        return "Yep, te has registrado y se te ha generado un token permanente. Te devuelvo un token temporal generado a partir del permanente.";
    }

    @GetMapping("/login")
    public String register() {
        return "Yep, te has logueado. Te devuelvo un token temporal generado a partir del permanente.";
    }

}
