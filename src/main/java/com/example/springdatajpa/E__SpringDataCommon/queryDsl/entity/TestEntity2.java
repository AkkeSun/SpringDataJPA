package com.example.springdatajpa.E__SpringDataCommon.queryDsl.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class TestEntity2 {

    @Id @GeneratedValue
    private Long id;
    private String name;

    @OneToMany(mappedBy = "testEntity2", cascade = CascadeType.ALL)
    List<TestEntity1> testEntity1 = new ArrayList<>();


    public TestEntity2(String name){
        this.name = name;
    }

    public TestEntity2() {}
}
