package com.example.springdatajpa.E__SpringDataCommon.basic;

import com.example.springdatajpa.C__RelationMapping.Team;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CrudRepository_Team extends JpaRepository<Team, Long> {
    Optional<Team> findByName(String name);
}
