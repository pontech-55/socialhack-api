package com.example.socialhackapi.controller;

import com.example.socialhackapi.service.CentersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CentersController {

    private final CentersService centersService;

    @Autowired
    public CentersController(CentersService centersService) {
        this.centersService = centersService;
    }

    @GetMapping("/centers/hi")
    public String hi() {
        return "Hi from centers";
    }

}
