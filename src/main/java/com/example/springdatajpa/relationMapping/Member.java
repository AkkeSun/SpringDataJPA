package com.example.springdatajpa.relationMapping;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
@NamedQueries({
        @NamedQuery(
            name = "Member.SelectAll",
            query = "SELECT m FROM Member m")
})
public class Member {

    @Id
    @GeneratedValue
    @Column(name = "MEMBER_ID")
    private Long id;

    @Column(name = "USERNAME")
    private String username;

    /****************************
    [Fetch]
     엔티티를 조회할 때 연관관계 객채들을 언제 가져올것인지 설정
     1. EARGY : 즉시로딩
        연관관계 객채를 모두 가져온다
        @ManyToOne default
     2. LAZY : 지연로딩
        연관관계 객채를 실제로 사용할 때 조회
        @OneToMany default
     ****************************/
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TEAM_ID") // DB에 저장될 외래키 컬럼명
    private Team team;

    // 양방향 매핑 함수
    public void saveFK(Team team){
        this.team = team;
        team.getMembers().add(this); // 순수 자바객채를 위한 설정
    }

    public String toString(){
        return "[id] : " + getId() +
                " / [name] : " + getUsername() +
                " / [teamName] : " + getTeam().getName();
    }

}
