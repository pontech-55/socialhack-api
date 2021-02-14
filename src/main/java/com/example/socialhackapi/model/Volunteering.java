package com.example.socialhackapi.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table(value = "voluntariado")
public class Volunteering {
    @Id
    @Column(value="ID")
    private int id;

    @Column(value="ID_CENTROS")
    private String centerId;

    @Column(value="TITULO")
    private String title;

    @Column(value="DESCRIPCION")
    private String description;

    @Column(value="URGENCIA")
    private String urgency;

    @Column(value="LOCALIDAD")
    private String locality;

    public Volunteering(int id, String centerId, String title, String description, String urgency, String locality) {
        this.id = id;
        this.centerId = centerId;
        this.title = title;
        this.description = description;
        this.urgency = urgency;
        this.locality = locality;
    }

    public String toJson () {
        return "{\n" +
                "\"id\" : " + "\"" + this.id + "\"," +
                "\"centerId\" : " + "\"" + this.centerId + "\"," +
                "\"title\" : " + "\"" + this.title + "\"," +
                "\"description\" : " + "\"" + this.description + "\"," +
                "\"urgency\" : " + "\"" + this.urgency + "\"," +
                "\"locality\" : " + "\"" + this.locality + "\"" +
                "}";
    }
}
