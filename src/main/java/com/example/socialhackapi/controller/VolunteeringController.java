package com.example.socialhackapi.controller;

import com.example.socialhackapi.service.VolunteeringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VolunteeringController {

    private final VolunteeringService volunteeringService;

    @Autowired
    public VolunteeringController(VolunteeringService volunteeringService) {
        this.volunteeringService = volunteeringService;
    }

    @GetMapping("/volunteering/hi")
    public String hi() {
        return "Hi from volunteering";
    }
}
