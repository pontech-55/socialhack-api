package com.example.socialhackapi.controller;

import com.example.socialhackapi.service.CenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CenterController {

    private final CenterService centerService;

    @Autowired
    public CenterController(CenterService centerService) {
        this.centerService = centerService;
    }

    @GetMapping("/center")
    public ResponseEntity<String> findCenter(
            @RequestParam(value = "id") Long id) {
        return new ResponseEntity<>(centerService.findCenterById(id), HttpStatus.OK);
    }

}
