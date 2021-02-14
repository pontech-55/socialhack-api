package com.example.socialhackapi.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table(value = "donaciones")
public class Donation {
    @Id
    @Column(value="ID")
    private int id;
    @Column(value="ID_CENTROS")
    private String centerId;
    @Column(value="DESCRIPCION")
    private String description;
    @Column(value="URGENCIA")
    private String urgency;
    @Column(value="LOCALIDAD")
    private String locality;
    @Column(value="ITEM")
    private String item;

    public Donation(String centerId, String description, String urgency, String locality, String item) {
        this.centerId = centerId;
        this.description = description;
        this.urgency = urgency;
        this.locality = locality;
        this.item = item;
    }

    public String toJson () {
        return "{\n" +
                "\"id\" : " + "\"" + this.id + "\"," +
                "\"centerId\" : " + "\"" + this.centerId + "\"," +
                "\"description\" : " + "\"" + this.description + "\"," +
                "\"urgency\" : " + "\"" + this.urgency + "\"," +
                "\"locality\" : " + "\"" + this.locality + "\"," +
                "\"item\" : " + "\"" + this.item + "\"" +
                "}";
    }
}
