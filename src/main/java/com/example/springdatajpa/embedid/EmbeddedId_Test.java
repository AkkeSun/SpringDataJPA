package com.example.springdatajpa.embedid;

import lombok.Setter;

import javax.persistence.*;

@Setter
@Entity
public class EmbeddedId_Test {

    @Id
    @GeneratedValue
    private Long id;

    @Embedded
    private Person master;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "street", column = @Column(name = "home_street")),
            @AttributeOverride(name = "city", column = @Column(name = "home_city")),
    })
    private Address homeAddress;


    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "street", column = @Column(name = "office_street")),
            @AttributeOverride(name = "city", column = @Column(name = "office_city")),
    })
    private Address officeAddress;

}
