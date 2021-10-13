package com.example.springdatajpa.F__JpaRepository.entityGraph.repository;

import com.example.springdatajpa.F__JpaRepository.entityGraph.entity.Graph1;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface Graph1Repository extends JpaRepository<Graph1, Long> {

    @EntityGraph(value = "graph.data1") // Fetch = EARGY
    @Query("select g from Graph1 g where g.id=:id")
    Graph1 getById1(Long id);

    @Query("select g from Graph1 g where g.id=:id")
    Graph1 getById2(Long id);
}
