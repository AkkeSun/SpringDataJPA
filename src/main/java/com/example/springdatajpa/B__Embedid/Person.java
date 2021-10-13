package com.example.springdatajpa.B__Embedid;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Data
public class Person {

    @Column(name = "name", unique = true)
    private String name;

    @Column(name = "phoneNumber")
    private String phoneNumber;

}
