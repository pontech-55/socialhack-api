package com.example.socialhackapi.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table(value = "CENTROS")
public class Center {

    @Id
    @Column(value = "ID")
    private Long id;

    @Column(value = "NODE")
    private String name;

    @Column(value = "DIRECCION")
    private String address;

    @Column(value = "CONCELLO")
    private String council;

    @Column(value = "CP")
    private String postalCode;

    @Column(value = "TELEFONO")
    private String phone;

    @Column(value = "EMAIL")
    private String email;

    @Column(value = "TIPO")
    private String type;

    @Column(value = "NOME_ENTIDADE")
    private String entityName;

    @Column(value = "ENT_ANIMO_LUCRO")
    private Boolean nonProfit;

    //private Set<Donations> donations;
    //private Set<Volunteering> volunteering;

    public Center(Long id, String name, String address, String council, String postalCode, String phone, String email, String type, String entityName, Boolean nonProfit) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.council = council;
        this.postalCode = postalCode;
        this.phone = phone;
        this.email = email;
        this.type = type;
        this.entityName = entityName;
        this.nonProfit = nonProfit;
    }

    public String toJson () {
        return "{\n" +
                "\"id\" : " + "\"" + this.id + "\"," +
                "\"name\" : " + "\"" + this.name + "\"," +
                "\"address\" : " + "\"" + this.address + "\"," +
                "\"council\" : " + "\"" + this.council + "\"," +
                "\"postalCode\" : " + "\"" + this.postalCode + "\"," +
                "\"phone\" : " + "\"" + this.phone + "\"," +
                "\"email\" : " + "\"" + this.email + "\"," +
                "\"type\" : " + "\"" + this.type + "\"," +
                "\"entityName\" : " + "\"" + this.entityName + "\"," +
                "\"nonProfit\" : " + "\"" + this.nonProfit + "\"" +
                "}";
    }

}
