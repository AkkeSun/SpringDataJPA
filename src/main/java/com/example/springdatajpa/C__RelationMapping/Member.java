package com.example.springdatajpa.C__RelationMapping;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/****************************
 [casecade]
 엔티티 상태를 전파시키는 옵션
 Transient : JPA가 상태변화를 모름
 Persistant : JPA가 관리중인 상태
 -> 변화에 일일이 쿼리를 실행하지 않고
 -> persistence가 판단하에 적절한 쿼리를 실행한다.
 Detached : JAP가 더이상 관리하지 않는 상태
 Removed : JPA가 관리중이지만 삭제하기로 한 상태
 -> session.delete()하면 key로 묶여있는 데이터를 모두 삭제시킨다

 [Fetch]
 엔티티를 조회할 때 연관관계 객채들을 언제 가져올것인지 설정
 1. EARGY : 즉시로딩
 연관관계 객채를 모두 가져온다
 @ManyToOne default
 2. LAZY : 지연로딩
 연관관계 객채를 실제로 사용할 때 조회
 @OneToMany default
 ****************************/

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

    @Transient
    private String TeamName;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
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
