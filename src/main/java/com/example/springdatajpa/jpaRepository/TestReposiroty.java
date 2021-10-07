package com.example.springdatajpa.jpaRepository;

import com.example.springdatajpa.relationMapping.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestReposiroty extends JpaRepository<Member, Long> {


}
