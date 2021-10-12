package com.example.springdatajpa.springDataCommon.custom.common;

import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

import javax.persistence.EntityManager;
import java.io.Serializable;

public class MyRepositoryimpl<T, ID extends Serializable> extends SimpleJpaRepository<T,ID>
        implements MyRepository<T, ID> {

    private EntityManager entityManager;

    public MyRepositoryimpl(JpaEntityInformation<T, ?> entityInformation, EntityManager entityManager) {
        super(entityInformation, entityManager);
    }

    @Override
    public boolean contains(T entity) {
        return entityManager.contains(entity);
    }
}
