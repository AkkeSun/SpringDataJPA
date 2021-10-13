package com.example.springdatajpa.E__SpringDataCommon.basic;

import com.example.springdatajpa.C__RelationMapping.Member;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CrudRepository_Member extends JpaRepository<Member, Long> {

    /*============================================
     여기에 추가하고싶은 쿼리 등록하기
	 =============================================*/



    // ------------ 1.쿼리 직접 짜주기 -------------
    String query = "SELECT m " +
            "FROM Member m " +            // FROM #{#entityName} m
            "INNER JOIN m.team t " +
            "WHERE t.name = :teamName" ;  // WHERE t.username = 1 첫번째 파라미터

    @Query(query)
    Page<Member> findByTeamName (String teamName, Pageable pageable);



    // ------------ 2. Method 이름으로 만들기 -------------

    // 기본: findBy 컬럼 And(or) 컬럼
    List<Member> findByUsernameAndId(String username, Long id);

    // 중복제거  : findDistinctBy 컬럼 And(or) 컬럼
    List<Member> findDistinctByUsernameAndId(String username, Long id);

    // 정렬 : findBy 컬럼 And(or) 컬럼 OrderBy 컬럼 ASC(DESC)
    List<Member> findAllByOrderByIdAsc();
}