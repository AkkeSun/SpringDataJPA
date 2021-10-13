package com.example.springdatajpa.E__SpringDataCommon.queryDsl.repository;

import com.example.springdatajpa.E__SpringDataCommon.queryDsl.entity.TestEntity2;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Entity2Repository extends JpaRepository<TestEntity2, Long> {

    TestEntity2 findByName(String name);

}