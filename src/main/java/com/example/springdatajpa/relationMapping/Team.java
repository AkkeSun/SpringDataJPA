package com.example.springdatajpa.relationMapping;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Team {

    @Id
    @GeneratedValue
    @Column(name = "MEMBER_ID")
    private Long id;
    private String name;

    /*******************************************************************
    [mapperedBy]
        부모엔티티에서 참조하고있는 자식 엔티티 이름을 적어 매핑

    [casecade]
        엔티티 상태를 전파시키는 옵션
        Transient : JPA가 상태변화를 모름
        Persistant : JPA가 관리중인 상태
            -> 변화에 일일이 쿼리를 실행하지 않고
			-> persistence가 판단하에 적절한 쿼리를 실행한다.
		Detached : JAP가 더이상 관리하지 않는 상태
        Removed : JPA가 관리중이지만 삭제하기로 한 상태
            -> session.delete()하면 key로 묶여있는 데이터를 모두 삭제시킨다
     *****************************************************************/

    @OneToMany(mappedBy = "team", cascade = CascadeType.ALL)
    List<Member> members = new ArrayList<>();

}
