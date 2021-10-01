package com.example.springdatajpa.relationMapping;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Member {

    @Id
    @GeneratedValue
    @Column(name = "MEMBER_ID")
    private Long id;

    @Column(name = "USERNAME")
    private String username;

    /****************************
    [Fetch]
     연관관계의 엔티티를 언제 가져올것인지 설정
     Eager : 지금 (@ManyToOne default)
     Lazy : 나중에 (@OneToMany default)
     ****************************/
    @ManyToOne
    @JoinColumn(name = "TEAM_ID") // DB에 저장될 외래키 컬럼명
    private Team team;

    // 양방향 매핑 함수
    public void saveFK(Team team){
        this.team = team;
        team.getMembers().add(this); // 순수 자바객채를 위한 설정
    }

}
