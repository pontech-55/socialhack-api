package com.example.socialhackapi.controller;

import com.example.socialhackapi.service.VolunteeringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VolunteeringController {

    private final VolunteeringService volunteeringService;

    @Autowired
    public VolunteeringController(VolunteeringService volunteeringService) {
        this.volunteeringService = volunteeringService;
    }

    @GetMapping("/volunteering")
    public ResponseEntity<String> register(
            @RequestParam(value = "urgency", required = false, defaultValue = "") String urgency,
            @RequestParam(value = "duration", required = false, defaultValue = "") String duration,
            @RequestParam(value = "locality", required = false, defaultValue = "") String locality,
            @RequestParam(value = "centerId", required = false, defaultValue = "") String centerId) {
        return new ResponseEntity<>(volunteeringService.findAll(urgency, duration, locality, centerId), HttpStatus.OK);
    }

    @GetMapping("/volunteering/create")
    public ResponseEntity<String> create(
            @RequestParam(value = "urgency", required = false, defaultValue = "") String urgency,
            @RequestParam(value = "duration", required = false, defaultValue = "") String duration,
            @RequestParam(value = "locality", required = false, defaultValue = "") String locality,
            @RequestParam(value = "centerId", required = false, defaultValue = "") String centerId,
            @RequestParam(value = "description", required = false, defaultValue = "") String description,
            @RequestParam(value = "title", required = false, defaultValue = "") String title) {
        return new ResponseEntity<>(volunteeringService.create(urgency, duration, locality, centerId, description, title), HttpStatus.OK);
    }
}
