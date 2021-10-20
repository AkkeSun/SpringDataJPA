package com.example.springdatajpa.F__JpaRepository.Specifications.join;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface JoinSpecRepository2 extends JpaRepository<JoinSpecEntity2, Long>,
        JpaSpecificationExecutor<JoinSpecEntity2> {
}
