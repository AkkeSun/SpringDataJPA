package com.example.springdatajpa.springDataCommon.custom;

import com.example.springdatajpa.relationMapping.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomRepository_Team extends JpaRepository<Team, Long>, CustomRepository {
}
