package com.example.springdatajpa.F__JpaRepository.entityGraph.entity;

import javax.persistence.*;

@Entity
@NamedEntityGraph(name = "graph.data1", attributeNodes = @NamedAttributeNode("graph2"))
public class Graph1 {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @ManyToOne // default Fetch = EARGY
    private Graph2 graph2;

    public Graph1(){};
    public Graph1(String name, Graph2 graph2){
        this.name = name;
        this.graph2 = graph2;
    }

}
