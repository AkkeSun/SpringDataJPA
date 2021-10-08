package com.example.springdatajpa.springDataCommon.custom;

import com.example.springdatajpa.relationMapping.Team;
import java.util.List;

public interface CustomRepository {

    List<Team> findByName(String name);

}