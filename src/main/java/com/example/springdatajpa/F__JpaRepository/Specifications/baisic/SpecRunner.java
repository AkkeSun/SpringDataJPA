package com.example.springdatajpa.F__JpaRepository.Specifications.baisic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class SpecRunner implements ApplicationRunner {

    @Autowired
    SpecRepository repository;


    @Override
    public void run(ApplicationArguments args) throws Exception {
        /*
        repository.saveAll(Arrays.asList(
            new SpecEntity("team1", "title sun", 3),
            new SpecEntity("team1", "sun title", 10),
            new SpecEntity("team1", "title", 7),
            new SpecEntity("team2", "title", 10),
            new SpecEntity("team2", "title", 6),
            new SpecEntity("team2", "title", 13)
        ));

        List<SpecEntity> list1 = repository.findAll(Specs.count10Up());
        list1.forEach(System.out::println);
        System.out.println("================");

        // AND
        List<SpecEntity> list2 = repository.findAll(Specs.likeTitle("sun").and(Specs.count10Up()));
        list2.forEach(System.out::println);
        System.out.println("================");

        // OR
        List<SpecEntity> list3 = repository.findAll(Specs.likeTitle("sun").or(Specs.count10Up()));
        list3.forEach(System.out::println);
        System.out.println("================");
        */

        //-------- Page로도 받을 수 있다 ----------
    }
}
