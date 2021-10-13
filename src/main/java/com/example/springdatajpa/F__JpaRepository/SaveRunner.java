package com.example.springdatajpa.F__JpaRepository;

import com.example.springdatajpa.E__SpringDataCommon.domainEvent.Team2;
import com.example.springdatajpa.E__SpringDataCommon.domainEvent.Team2Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component
@Transactional
public class SaveRunner implements ApplicationRunner {

    @Autowired
    Team2Repository repository;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        /************************
         *  객채의 ID값을 설정하지 않으면 Jpa가 새로운 객채로 이해하고 persist 상태가 된다.
         *  이 때 영속화된 객채(savedTl)와 원 객채(t1)은 같은 객채이다.
         *
         *  객채의 ID값을 지정하고 ID값이 이미 존재하는 값이라면 save는 UPDATE Query를 실행한다.
         ************************/
        /*
        // INSERT
        Team2 t1 = new Team2();
        t1.setName("A TEAM"); // Persist
        Team2 savedT1 = repository.save(t1);
        System.err.println(t1.equals(savedT1)); // true

        // UPDATE
        Team2 t2 = new Team2();
        t2.setId(savedT1.getId()); // merge
        t2.setName("B TEAM");
        Team2 savedT2 = repository.save(t2);
        System.err.println(t2.equals(savedT2)); // false

        // 추가 TIP : persist 상태 유지를 위해 영속화된 객채를 사용하자!!!!
        savedT2.setName("B TEAM UPDATE");
        Team2 savedT3 = repository.save(savedT2);
        System.err.println(savedT2.equals(savedT3)); // true
        */
    }
}
