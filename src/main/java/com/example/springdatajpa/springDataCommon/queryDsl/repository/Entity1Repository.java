package com.example.springdatajpa.springDataCommon.queryDsl.repository;

import com.example.springdatajpa.springDataCommon.queryDsl.entity.TestEntity1;
import com.example.springdatajpa.springDataCommon.queryDsl.repository.NewRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Entity1Repository extends JpaRepository<TestEntity1, Long>, NewRepository {
}
