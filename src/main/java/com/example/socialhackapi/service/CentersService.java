package com.example.socialhackapi.service;

import com.example.socialhackapi.repository.CentersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CentersService {

    private CentersRepository centersRepository;

    @Autowired
    public CentersService(CentersRepository centersRepository) {
        this.centersRepository = centersRepository;
    }

}
