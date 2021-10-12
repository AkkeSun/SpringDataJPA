package com.example.springdatajpa.springDataCommon.domainEvent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component
@Transactional
public class TeamRunner implements ApplicationRunner {

    @Autowired
    ApplicationEventPublisher eventPublisher;

    @Autowired
    Team2Repository repository;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        /*
        // 일반 이벤트 사용하는 경우
        if(1 == 1) {
            Team2 team = new Team2();
            team.setName("USA");
            repository.save(teams);
            eventPublisher.publishEvent(new TeamPublishedEvent(team));
        }


        // registerEvent 사용하는 경우
        Team2 teams = new Team2();
        teams.setName("Test2");
        repository.save(teams.publish());
        */

    }
}

