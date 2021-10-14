package com.example.springdatajpa.F__JpaRepository.projection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component
public class ProjectionRunner implements ApplicationRunner {

    @Autowired
    ProjectionRepository repository1;

    @Transactional
    @Override
    public void run(ApplicationArguments args) throws Exception {
        /*
        ProjectionEntity saved = repository1.save(new ProjectionEntity("d1", "d2", "d3", "d4", "d5"));
        ProjectionSummary summary = repository1.findByData4(saved.getData4(), ProjectionSummary.class).get(0);
        System.out.println(summary.getMyData());
        */
    }
}