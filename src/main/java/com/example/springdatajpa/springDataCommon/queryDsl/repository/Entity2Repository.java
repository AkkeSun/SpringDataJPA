package com.example.springdatajpa.springDataCommon.queryDsl.repository;

import com.example.springdatajpa.springDataCommon.queryDsl.entity.TestEntity2;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Entity2Repository extends JpaRepository<TestEntity2, Long> {

    TestEntity2 findByName(String name);

}