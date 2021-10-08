package com.example.springdatajpa.relationMapping;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/*******************************************************************
 [mapperedBy]
 부모엔티티에서 참조하고있는 자식 엔티티 이름을 적어 매핑
 *****************************************************************/

@Entity
@Getter
@Setter
public class Team {

    @Id
    @GeneratedValue
    @Column(name = "MEMBER_ID")
    private Long id;
    private String name;


    @OneToMany(mappedBy = "team", cascade = CascadeType.ALL)
    List<Member> members = new ArrayList<>();

    public String toString(){
        return "[id] : " + getId() + " / [name] : " + getName();
    }

}
