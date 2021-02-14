package com.example.socialhackapi.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table(value = "DONACIONES")
public class Donation {
    @Id
    @Column(value="ID")
    private long id;
    @Column(value="ID_CENTROS")
    private long centerId;
    @Column(value="TITULO")
    private String title;
    @Column(value="DESCRIPCION")
    private String description;
    @Column(value="URGENCIA")
    private String urgency;
    @Column(value="TIPO")
    private String type;
    @Column(value="CONTACTO")
    private String contact;

    public Donation(long id, long centerId, String title, String description, String urgency, String type, String contact) {
        this.id = id;
        this.centerId = centerId;
        this.title = title;
        this.description = description;
        this.urgency = urgency;
        this.type = type;
        this.contact = contact;
    }

    public String toJson () {
        return "{\n" +
                "\"id\" : " + "\"" + this.id + "\"," +
                "\"centerId\" : " + "\"" + this.centerId + "\"," +
                "\"title\" : " + "\"" + this.title + "\"," +
                "\"description\" : " + "\"" + this.description + "\"," +
                "\"urgency\" : " + "\"" + this.urgency + "\"," +
                "\"type\" : " + "\"" + this.type + "\"," +
                "\"contact\" : " + "\"" + this.contact + "\"" +
                "}";
    }
}
