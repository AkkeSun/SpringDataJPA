package com.example.springdatajpa.basic;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.Date;

@Component
@Transactional // 한 트랜잭션 내에서 쿼리 작업이 이루어지게 설정 (method에 붙여도 됨)
public class BasicRunner implements ApplicationRunner {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Account account = new Account();


        account.setUsername("exg");
        account.setPassword("213213123");
        account.setDate(new Date());
        account.setSecret("data");

        // Entity를 사용한 영속화
        //entityManager.persist(account);

        // Hibernate를 사용한 영속화 (org.hibernate.Session)
        /*
        Session session = entityManager.unwrap(Session.class);
        session.save(account);
        */
    }
}
