package com.example.springdatajpa.springDataCommon.queryDsl.repository;

import com.example.springdatajpa.springDataCommon.queryDsl.entity.QTestEntity1;
import com.example.springdatajpa.springDataCommon.queryDsl.entity.TestEntity1;
import com.example.springdatajpa.springDataCommon.queryDsl.entity.TestEntity2;
import com.querydsl.core.QueryResults;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.util.List;

public class NewRepositoryImpl implements NewRepository{

    private final JPAQueryFactory jpaQueryFactory;

    public NewRepositoryImpl(JPAQueryFactory jpaQueryFactory) {
        this.jpaQueryFactory = jpaQueryFactory;
    }

    @Override
    public List<TestEntity1> findAllInnerFetchJoin(String name) {
        return jpaQueryFactory.selectFrom(QTestEntity1.testEntity1)
                .innerJoin(QTestEntity1.testEntity1.testEntity2)
                .where(QTestEntity1.testEntity1.testEntity2.name.eq(name))
                .fetch(); // List Return
    }

    @Override
    public Page<TestEntity1> findPages(String name, Pageable pageable) {
        QueryResults<TestEntity1> result = jpaQueryFactory.selectFrom(QTestEntity1.testEntity1)
                .innerJoin(QTestEntity1.testEntity1.testEntity2)
                .where(QTestEntity1.testEntity1.testEntity2.name.eq(name))
                .fetchResults();

        return new PageImpl<>(result.getResults(), pageable, result.getTotal());
    }


}
