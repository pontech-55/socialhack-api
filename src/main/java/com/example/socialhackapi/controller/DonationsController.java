package com.example.socialhackapi.controller;

import com.example.socialhackapi.service.DonationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DonationsController {

    private final DonationsService donationsService;

    @Autowired
    public DonationsController(DonationsService donationsService) {
        this.donationsService = donationsService;
    }

    @GetMapping("/donations/hi")
    public String hi() {
        return "Hi from donations";
    }

}
