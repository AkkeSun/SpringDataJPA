package com.example.springdatajpa.F__JpaRepository.entityGraph;

import com.example.springdatajpa.F__JpaRepository.entityGraph.entity.Graph1;
import com.example.springdatajpa.F__JpaRepository.entityGraph.entity.Graph2;
import com.example.springdatajpa.F__JpaRepository.entityGraph.repository.Graph1Repository;
import com.example.springdatajpa.F__JpaRepository.entityGraph.repository.Graph2Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class GraphRunner implements ApplicationRunner {

    @Autowired
    Graph1Repository graph1Repository;

    @Autowired
    Graph2Repository graph2Repository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        /*
        Graph2 returnData = graph2Repository.save(new Graph2("test"));
        graph1Repository.save( new Graph1("data1", returnData));

        graph1Repository.getById1(1L);
        graph1Repository.getById2(1L);
        */
    }
}
