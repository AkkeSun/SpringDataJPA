package com.example.springdatajpa.E__SpringDataCommon.queryDsl.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
public class TestEntity1 {

    @Id @GeneratedValue
    private Long id;

    private String name;

    @ManyToOne(cascade = CascadeType.ALL)
    private TestEntity2 testEntity2;


    public TestEntity1(String name, TestEntity2 testEntity2){
        this.name = name;
        this.testEntity2 = testEntity2;
    }

    public TestEntity1() {
    }

    public String toString(){
        return this.name;
    }
}
