package com.example.socialhackapi.service;

import com.example.socialhackapi.model.Volunteering;
import com.example.socialhackapi.repository.VolunteeringRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VolunteeringService {

    private VolunteeringRepository volunteeringRepository;

    @Autowired
    public VolunteeringService(VolunteeringRepository volunteeringRepository) {
        this.volunteeringRepository = volunteeringRepository;
    }

    public String findAll(String urgency, String duration, String locality, String centerId) {
        List<Volunteering> volunteeringList = volunteeringRepository.findAndFilterAllVolunteering(urgency, duration, locality, centerId);
        return createJsonFromList(volunteeringList);
    }

    private String createJsonFromList(List<Volunteering> volunteeringList) {
        StringBuilder json = new StringBuilder("""
                {
                "data": [
                """);
        for(int i = 0; i < volunteeringList.size(); i++) {
            json.append(volunteeringList.get(i).toJson());
            if(i != volunteeringList.size() - 1) json.append(",");
        }
        json.append("""
                ]
                }
                """);
        return json.toString();
    }

    public String create(String urgency, String duration, String locality, String centerId, String description, String title) {
        volunteeringRepository.save(new Volunteering(centerId, title, description, urgency, locality, duration));
        return "Volunteering offer created successfully.";
    }
}
