package com.example.springdatajpa.embedid;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Data
public class Person {

    @Column(name = "name", unique = true)
    private String name;

    @Column(name = "phoneNumber")
    private String phoneNumber;

}
