package com.example.socialhackapi.controller;

import com.example.socialhackapi.service.DonationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DonationController {

    private final DonationService donationService;

    @Autowired
    public DonationController(DonationService donationService) {
        this.donationService = donationService;
    }

    @GetMapping("/donations")
    public ResponseEntity<String> register(
            @RequestParam(value = "urgency", required = false, defaultValue = "") String urgency,
            @RequestParam(value = "item", required = false, defaultValue = "") String item,
            @RequestParam(value = "locality", required = false, defaultValue = "") String locality,
            @RequestParam(value = "centerId", required = false, defaultValue = "") String centerId) {
        return new ResponseEntity<>(donationService.findAll(urgency, item, locality, centerId), HttpStatus.OK);
    }

}
