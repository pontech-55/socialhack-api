package com.example.socialhackapi.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table(value = "USUARIOS")
public class User {
    @Id
    @Column(value="ID")
    private Long id;
    @Column(value="NOME")
    private String username;
    @Column(value="EMAIL")
    private String email;
    @Column(value="PASSWORD")
    private String hashedPassword;
    @Column(value="ISENTITY")
    private Boolean isEntity;
    private Center center;

    public User (String username, String email, String hashedPassword, Boolean isEntity) {
        this.username = username;
        this.email = email;
        this.hashedPassword = hashedPassword;
        this.isEntity = isEntity;
    }

    public void setHashedPassword (String hashedPassword) {
        this.hashedPassword = hashedPassword;
    }

    public String toJson () {
        return "{\n" +
                "\"username\" : " + "\"" + this.username + "\"," +
                "\"token\" : " + "\"" + this.hashedPassword + "\"," +
                "\"isEntity\" : " + "\"" + this.isEntity + "\"" +
                "}";
    }
}
