package com.example.springdatajpa.springDataCommon;


import com.example.springdatajpa.relationMapping.Member;
import com.example.springdatajpa.relationMapping.Team;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

@RunWith(SpringRunner.class)
@DataJpaTest // Repository만 테스트하는 기능
public class CrudRepositoryTestTest {

    // repository만 등록 가능
    @Autowired
    CrudRepositoryTest test;


    @Test
    public void ruedRepository(){

        Team team = new Team();
        team.setName("Korea");
        Member member = new Member();

        member.setTeam(team);
        member.setUsername("aaa");

        test.save(member);
    }
}