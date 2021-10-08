package com.example.springdatajpa.springDataCommon.basic;

import com.example.springdatajpa.relationMapping.Team;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CrudRepository_Team extends JpaRepository<Team, Long> {
    Optional<Team> findByName(String name);
}
