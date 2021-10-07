package com.example.springdatajpa.springDataCommon;

import com.example.springdatajpa.relationMapping.Member;
import org.springframework.data.repository.CrudRepository;

public interface CrudRepositoryTest extends CrudRepository<Member, Long> {
}
