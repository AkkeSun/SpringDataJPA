package com.example.springdatajpa.E__SpringDataCommon.custom.solo;

import com.example.springdatajpa.C__RelationMapping.Team;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class CustomRepositoryImpl implements CustomRepository {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Team> findByName(String name) {

        String jpql = "SELECT t FROM Team t WHERE t.name = :name";

        return entityManager.createQuery(jpql, Team.class)
                .setParameter("name", name)
                .getResultList();
    }
}
