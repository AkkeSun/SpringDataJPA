package com.example.springdatajpa.relationMapping;

import org.hibernate.Session;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Component
public class RelationRunner implements ApplicationRunner {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    @Transactional
    public void run(ApplicationArguments args) throws Exception {

        Session session = entityManager.unwrap(Session.class);

        /*****************************

         casecade설정으로 인해
         hibernate가 변화를 감지해서
         쿼리를 실행한다.

         ******************************/

        // casecade를 지정한 entity만 save()
        /*
        Team team = new Team();
        team.setName("Japan");
        session.save(team);

        // casecade : member1, 2 자동 insert
        Member member1 = new Member();
        member1.setUsername("sun2");
        member1.saveFK(team);

        Member member2 = new Member();
        member2.setUsername("exg2");
        member2.saveFK(team);

        // casecade : member1, 2 자동 update (exg3 버전만)
        member2.setUsername("exg2");
        member2.setUsername("exg3");

        // casecade : team PK 1L이 FK인 하위 DB Data 전부 삭제
        Team t = session.get(Team.class, 1L);
        // session.delete(t);


       //------------------------------------

        List<Member> members = team.getMembers();
        for (int i=0; i<members.size(); i++){
            System.out.println(members.get(i).getUsername());
        }

        */
    }
}
