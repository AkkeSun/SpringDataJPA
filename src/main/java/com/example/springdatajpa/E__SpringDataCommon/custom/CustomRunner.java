package com.example.springdatajpa.E__SpringDataCommon.custom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component
public class CustomRunner implements ApplicationRunner {

    @Autowired
//    CustomRepository_Team repository;

    @Override
    @Transactional
    public void run(ApplicationArguments args) throws Exception {
        /*
        List<Team> result = repository.findByName("Korea");
        result.forEach(System.out::println);
    `   */
    }
}
