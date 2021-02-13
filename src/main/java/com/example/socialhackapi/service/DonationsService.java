package com.example.socialhackapi.service;

import com.example.socialhackapi.repository.DonationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DonationsService {

    private DonationsRepository donationsRepository;

    @Autowired
    public DonationsService(DonationsRepository donationsRepository) {
        this.donationsRepository = donationsRepository;
    }

}
