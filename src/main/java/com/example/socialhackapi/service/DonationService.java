package com.example.socialhackapi.service;

import com.example.socialhackapi.model.Donation;
import com.example.socialhackapi.model.Volunteering;
import com.example.socialhackapi.repository.DonationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DonationService {

    private DonationRepository donationRepository;

    @Autowired
    public DonationService(DonationRepository donationRepository) {
        this.donationRepository = donationRepository;
    }

    public String findAll(String urgency, String item, String locality, String centerId) {
        List<Donation> donationsList = donationRepository.findAndFilterAllDonations(urgency, item, locality, centerId);
        return createJsonFromList(donationsList);
    }

    private String createJsonFromList(List<Donation> donationsList) {
        StringBuilder json = new StringBuilder("""
                {
                "data": [
                """);
        for(int i = 0; i < donationsList.size(); i++) {
            json.append(donationsList.get(i).toJson());
            if(i != donationsList.size() - 1) json.append(",");
        }
        json.append("""
                ]
                }
                """);
        return json.toString();
    }
}
