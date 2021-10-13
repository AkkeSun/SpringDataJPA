package com.example.springdatajpa.D__Query;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Component
public class QueryRunner implements ApplicationRunner {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    @Transactional
    public void run(ApplicationArguments args) throws Exception {

        /*
        // JPQL : 엔티티 객채 모델 기반의 쿼리 작성 (FROM Entity 객채명)
        String jpql = "SELECT t FROM Team t WHERE t.name = :name";

        List<Team> teams = entityManager.createQuery(jpql, Team.class) // 쿼리, 리턴타입
                          .setParameter("name", "korea")
                          .getResultList();
        System.out.println("=====================");
        teams.forEach(System.out::println);




        // Join
        String query = "SELECT m " +
                       "FROM Member m " +
                       "INNER JOIN m.team t " +
                       "WHERE t.name = :teamName" ;

        List<Member> joinMembers = entityManager.createQuery(query, Member.class)
                .setParameter("teamName", "korea")
                .getResultList();

        System.out.println("=====================");
        joinMembers.forEach(System.out::println);
        */



        // Fetch Join
        /*****
         * JPQL에 최적화된 조인방식. SQL 호출 횟수를 줄여 성능 최적화
         * 한계 1 : 별칭을 줄 수 없음
         * 한계 2 : 둘 이상의 컬렉션을 패치할 수 없음
         * 한계 3 : 페이징 API 사용 불가
         *****/
        /*
        String query2 = "SELECT m " +
                        "FROM Member m " +
                        "JOIN fetch m.team " +
                        "WHERE m.team.name = :teamName" ;

        List<Member> FetchMembers = entityManager.createQuery(query2, Member.class)
                .setParameter("teamName", "korea")
                .getResultList();

        System.out.println("=====================");
        FetchMembers.forEach(System.out::println);





        // Named쿼리 : 정적쿼리 (미리 쿼리를 짜놓고 불러온다)
        List<Member> resultList = entityManager.createNamedQuery("Member.SelectAll", Member.class)
                .getResultList();

        System.out.println("=====================");
        resultList.forEach(System.out::println);

        /*********************
         * 그 외
         * 서브쿼리는 where, having절만 가능하다
         *********************/


    }
}