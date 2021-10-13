package com.example.springdatajpa.E__SpringDataCommon.custom.solo;

import com.example.springdatajpa.C__RelationMapping.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomRepository_Team extends JpaRepository<Team, Long>, CustomRepository {
}
