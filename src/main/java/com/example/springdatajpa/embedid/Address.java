package com.example.springdatajpa.embedid;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Data
public class Address {

    @Column(name = "steet")
    private String street;

    @Column(name = "city")
    private String city;

}