package com.example.springdatajpa.springDataCommon.custom;

import com.example.springdatajpa.relationMapping.Team;
import com.example.springdatajpa.springDataCommon.basic.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;

@Component
public class CustomRunner implements ApplicationRunner {

    @Autowired
    CustomRepository_Team repository;

    @Override
    @Transactional
    public void run(ApplicationArguments args) throws Exception {

        List<Team> result = repository.findByName("Korea");
        result.forEach(System.out::println);

    }
}
