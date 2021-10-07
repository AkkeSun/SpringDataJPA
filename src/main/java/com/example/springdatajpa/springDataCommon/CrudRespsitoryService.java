package com.example.springdatajpa.springDataCommon;

import com.example.springdatajpa.relationMapping.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public class CrudRespsitoryService {

    @Autowired
    CrudRepositoryTest repositoryTest;

    public void test(){

        //--------- Create -----------
        repositoryTest.save(new Member());

        Member m1 = new Member();
        Member m2 = new Member();
        repositoryTest.saveAll(List.of(m1, m2));


        //---------- Read -------------
        List <Member> members1 = (List<Member>) repositoryTest.findAll();
        List <Member> members2 = (List<Member>) repositoryTest.findAllById(List.of(2L, 3L));
        Optional<Member> m3 = repositoryTest.findById(2L);
        Long count = repositoryTest.count();
        boolean hasObject = repositoryTest.existsById(2L);


        //--------- Delete --------------
        repositoryTest.deleteAll();
        repositoryTest.deleteAllById(List.of(2L,3L));
        repositoryTest.delete(new Member());
        repositoryTest.deleteById(2L);

    }
}
