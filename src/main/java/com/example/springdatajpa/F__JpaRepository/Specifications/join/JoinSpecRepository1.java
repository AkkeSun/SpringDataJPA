package com.example.springdatajpa.F__JpaRepository.Specifications.join;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface JoinSpecRepository1 extends JpaRepository<JoinSpecEntity1, Long>,
        JpaSpecificationExecutor<JoinSpecEntity1> {
}
