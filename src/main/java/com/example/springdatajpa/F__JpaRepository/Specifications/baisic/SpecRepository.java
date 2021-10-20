package com.example.springdatajpa.F__JpaRepository.Specifications.baisic;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface SpecRepository extends JpaRepository<SpecEntity, Long>,
        JpaSpecificationExecutor<SpecEntity> {
}
