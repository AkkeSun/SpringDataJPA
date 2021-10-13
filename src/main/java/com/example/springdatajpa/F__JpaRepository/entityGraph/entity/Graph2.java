package com.example.springdatajpa.F__JpaRepository.entityGraph.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Graph2 {

    @Id @GeneratedValue
    private Long id;

    private String name;

    public Graph2(){};
    public Graph2(String name){
        this.name = name;
    }

}
