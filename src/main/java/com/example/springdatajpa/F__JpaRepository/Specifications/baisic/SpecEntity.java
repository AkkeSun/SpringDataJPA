package com.example.springdatajpa.F__JpaRepository.Specifications.baisic;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class SpecEntity {
    @Id @GeneratedValue
    private Long id;
    private String category;
    private String title;
    private int count;

    public SpecEntity(String category, String title, int count) {
        this.category = category;
        this.title = title;
        this.count = count;
    }

    @Override
    public String toString() {
        return "SpecEntity{" +
                "id=" + id +
                ", category='" + category + '\'' +
                ", title='" + title + '\'' +
                ", count=" + count +
                '}';
    }
}
