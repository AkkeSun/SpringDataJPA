package com.example.springdatajpa.F__JpaRepository.Specifications.join;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class JoinSpecEntity2 {

    @Id @GeneratedValue
    private Long id;
    private String title;

    public JoinSpecEntity2(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "JoinSpecEntity2{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}
