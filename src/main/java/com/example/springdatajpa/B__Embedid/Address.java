package com.example.springdatajpa.B__Embedid;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Data
public class Address {

    @Column(name = "steet")
    private String street;

    @Column(name = "city")
    private String city;

}