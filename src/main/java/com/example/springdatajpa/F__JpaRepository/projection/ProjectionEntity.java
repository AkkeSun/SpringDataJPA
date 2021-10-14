package com.example.springdatajpa.F__JpaRepository.projection;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter @NoArgsConstructor
public class ProjectionEntity {

    @Id @GeneratedValue
    private Long id;

    private String data1;

    private String data2;

    private String data3;

    private String data4;

    private String data5;

    public ProjectionEntity(String d1, String d2, String d3, String d4, String d5) {
        this.data1 = d1;
        this.data2 = d2;
        this.data3 = d3;
        this.data4 = d4;
        this.data5 = d5;
    }

}
