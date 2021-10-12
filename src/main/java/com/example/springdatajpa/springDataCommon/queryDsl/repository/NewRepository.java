package com.example.springdatajpa.springDataCommon.queryDsl.repository;

import com.example.springdatajpa.springDataCommon.queryDsl.entity.TestEntity1;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface NewRepository {

    List<TestEntity1> findAllInnerFetchJoin(String name);
    Page<TestEntity1> findPages(String name, Pageable pageable);

}