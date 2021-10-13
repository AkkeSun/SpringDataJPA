package com.example.springdatajpa.E__SpringDataCommon.queryDsl.repository;

import com.example.springdatajpa.E__SpringDataCommon.queryDsl.entity.TestEntity1;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Entity1Repository extends JpaRepository<TestEntity1, Long>, NewRepository {
}
