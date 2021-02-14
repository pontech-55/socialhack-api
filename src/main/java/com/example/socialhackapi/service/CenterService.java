package com.example.socialhackapi.service;

import com.example.socialhackapi.repository.CenterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CenterService {

    private CenterRepository centerRepository;

    @Autowired
    public CenterService(CenterRepository centerRepository) {
        this.centerRepository = centerRepository;
    }

    public String findCenterById(String id) {
        return centerRepository.findCenterById(id).toJson();
    }
}
