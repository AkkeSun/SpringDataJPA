package com.example.springdatajpa.F__JpaRepository.Specifications.join;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class JoinSpecEntity1 {

    @Id @GeneratedValue
    private Long id;
    private String title;
    private int count;

    @ManyToOne
    private JoinSpecEntity2 joinSpecEntity2;

    public JoinSpecEntity1(String title, int count, JoinSpecEntity2 entity2) {
        this.title = title;
        this.count = count;
        this.joinSpecEntity2 = entity2;
    }

    @Override
    public String toString() {
        return "JoinSpecEntity1{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", count=" + count +
                ", entity2=" + joinSpecEntity2 +
                '}';
    }
}
