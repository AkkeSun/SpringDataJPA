package com.example.springdatajpa.E__SpringDataCommon.basic;

import com.example.springdatajpa.C__RelationMapping.Member;
import com.example.springdatajpa.C__RelationMapping.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CrudService {

    @Autowired
    CrudRepository_Member crudRepositoryMember;

    @Autowired
    CrudRepository_Team crudRepositoryTeam;


    //======================== 기본 기능 ===========================
    public void test(){

        //--------- Create -----------
        crudRepositoryMember.save(new Member());

        Member m1 = new Member();
        Member m2 = new Member();
        crudRepositoryMember.saveAll(List.of(m1, m2));


        //---------- Read -------------
        List <Member> members1 = (List<Member>) crudRepositoryMember.findAll();
        List <Member> members2 = (List<Member>) crudRepositoryMember.findAllById(List.of(2L, 3L));
        Optional<Member> m3 = crudRepositoryMember.findById(2L);
        Member optionalMember = m3.orElseThrow(IllegalAccessError::new); // 객채가 없으면 예외를 발생

        Long count = crudRepositoryMember.count();
        boolean hasObject = crudRepositoryMember.existsById(2L);

        //--------- Delete --------------
        crudRepositoryMember.deleteAll();
        crudRepositoryMember.deleteAllById(List.of(2L,3L));
        crudRepositoryMember.delete(new Member());
        crudRepositoryMember.deleteById(2L);
    }



    //------------------------------------------------------------------------


    // INSERT
    public Member save (Member member){
        Optional<Team> result = crudRepositoryTeam.findByName(member.getTeamName());
        Team team = result.orElseThrow(IllegalAccessError::new);
        member.saveFK(team);
        return crudRepositoryMember.save(member);
    }


    // 페이징 (기본) : JpaRepository 기능
    // localhost:8080/getPages?page=0&size=2&sort=id,asc&sort=rank,desc
    public Page<Member> getPages(Pageable pageable){
        return crudRepositoryMember.findAll(pageable);
    }


    // 페이징 : 검색을 위한 커스터마이징 실시
    public Page<Member> getPagesForRunner(String teamName, int page, int size, String column, String order){
        Sort sort = getSort(column, order);
        Pageable pageable = PageRequest.of(page, size, sort);
        return crudRepositoryMember.findByTeamName(teamName, pageable);
    }


    // Sort Type Return Method
    public static final Sort getSort(String column, String order) {
        Sort sort = null;

        if("asc".equals(order) || "".equals(order))
            sort = Sort.by(column).ascending();
        if("desc".equals(order))
            sort = Sort.by(column).descending();

        return sort;
    }
}
