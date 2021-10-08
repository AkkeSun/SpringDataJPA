package com.example.springdatajpa.springDataCommon.basic;

import com.example.springdatajpa.relationMapping.Member;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CrudRepository_Member extends JpaRepository<Member, Long> {

    /**********************************
     * [ 커스텀 쿼리 만들기 ]
     * 1. @Query / @NamedQuery 에 선언되어있는 쿼리를 찾는다
     * 2. 없으면 Method 이름을 보고 유추하여 찾는다.
     **********************************/

    // @Query("SELECT t FROM Team t WHERE t.name = :name")
    // @Query("SELECT t FROM Team t WHERE t.name = 1") // 첫번째 파라미
    // @Query("SELECT t FROM #{#entityName} t WHERE t.name = 1") // Repository<obj, id> 입력한 객채명 로드

    String query = "SELECT m " +
                   "FROM Member m " +
                   "INNER JOIN m.team t " +
                   "WHERE t.name = :teamName" ;

    @Query(query)
    Page<Member> findByTeamName (String teamName, Pageable pageable);

    // 기본: findBy 컬럼 And(or) 컬럼
    List<Member> findByUsernameAndId(String username, Long id);

    // 중복제거  : findDistinctBy 컬럼 And(or) 컬럼
    List<Member> findDistinctByUsernameAndId(String username, Long id);

    // 정렬 : findBy 컬럼 And(or) 컬럼 OrderBy 컬럼 ASC(DESC)
    List<Member> findAllByOrderByIdAsc();
}