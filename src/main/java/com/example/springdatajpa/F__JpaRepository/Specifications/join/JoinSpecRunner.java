package com.example.springdatajpa.F__JpaRepository.Specifications.join;

import com.example.springdatajpa.F__JpaRepository.Specifications.baisic.SpecRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class JoinSpecRunner implements ApplicationRunner {

    @Autowired
    JoinSpecRepository1 repository1;

    @Autowired
    JoinSpecRepository2 repository2;


    @Override
    public void run(ApplicationArguments args) throws Exception {
        /*
        JoinSpecEntity2 returnEntity1 = repository2.save( new JoinSpecEntity2("Category1"));
        JoinSpecEntity2 returnEntity2 = repository2.save( new JoinSpecEntity2("Category2"));

        repository1.saveAll(Arrays.asList(
                new JoinSpecEntity1("title1", 1, returnEntity1),
                new JoinSpecEntity1("title2", 2, returnEntity1),
                new JoinSpecEntity1("title3", 3, returnEntity2),
                new JoinSpecEntity1("title4", 4, returnEntity2)
         ));



        // Join Example
        List<JoinSpecEntity1> list1 = repository1.findAll(JoinSpecs.JoinExample1(returnEntity1.getTitle())
                                                     .and(JoinSpecs.JoinExample2("title2")));
        list1.forEach(System.out::println);
        System.out.println("================");


        // Spec Util Example
        HashMap<String, Object> filter = new HashMap<>();
        filter.put("title", "title1");
        List<JoinSpecEntity1> list2 = repository1.findAll(JoinSpecs.UtilSpecs(filter));
        list2.forEach(System.out::println);
        System.out.println("================");
         */
    }
}
