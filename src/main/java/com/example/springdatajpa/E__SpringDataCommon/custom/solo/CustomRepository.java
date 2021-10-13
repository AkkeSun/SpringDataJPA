package com.example.springdatajpa.E__SpringDataCommon.custom.solo;

import com.example.springdatajpa.C__RelationMapping.Team;
import java.util.List;

public interface CustomRepository {

    List<Team> findByName(String name);

}