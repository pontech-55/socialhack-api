package com.example.socialhackapi.service;

import com.example.socialhackapi.repository.VolunteeringRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VolunteeringService {

    private VolunteeringRepository volunteeringRepository;

    @Autowired
    public VolunteeringService(VolunteeringRepository volunteeringRepository) {
        this.volunteeringRepository = volunteeringRepository;
    }
}
