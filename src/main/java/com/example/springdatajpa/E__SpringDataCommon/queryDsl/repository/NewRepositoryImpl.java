package com.example.springdatajpa.E__SpringDataCommon.queryDsl.repository;

import com.example.springdatajpa.E__SpringDataCommon.queryDsl.entity.QTestEntity1;
import com.example.springdatajpa.E__SpringDataCommon.queryDsl.entity.QTestEntity2;
import com.example.springdatajpa.E__SpringDataCommon.queryDsl.entity.TestEntity1;
import com.querydsl.core.QueryResults;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.util.List;

public class NewRepositoryImpl implements NewRepository{

    @Autowired
    private final JPAQueryFactory jpaQueryFactory;

    public NewRepositoryImpl(JPAQueryFactory jpaQueryFactory) {
        this.jpaQueryFactory = jpaQueryFactory;
    }

    QTestEntity1 q1 = new QTestEntity1("q1");
    QTestEntity2 q2 = new QTestEntity2("q2");


    @Override
    public List<TestEntity1> findAllInnerFetchJoin(String name) {
        return jpaQueryFactory.selectFrom(q1)
                .innerJoin(q1.testEntity2)
                .where(q1.testEntity2.name.eq(name))
                .fetch(); // Tuple List Return
    }

    @Override
    public Page<TestEntity1> findPages(String name, Pageable pageable) {
        QueryResults<TestEntity1> result = jpaQueryFactory.selectFrom(q1)
                .innerJoin(q1.testEntity2)
                .where(q1.testEntity2.name.eq(name))
                .fetchResults(); // for paging return

        return new PageImpl<>(result.getResults(), pageable, result.getTotal());
    }

    @Override
    public List<String> subQueryTest(String name) {
        return jpaQueryFactory.select(q1.name.as("name1"))
                              .from(q1)
                              .where(
                                      q1.testEntity2.eq(jpaQueryFactory.selectFrom(q2).where(q2.name.eq(name))),
                                      q1.name.eq(q1.name)
                                    )
                              .fetch();
    }


}
