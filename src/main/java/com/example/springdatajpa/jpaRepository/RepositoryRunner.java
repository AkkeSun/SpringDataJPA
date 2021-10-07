package com.example.springdatajpa.jpaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component
public class RepositoryRunner implements ApplicationRunner {

    @Autowired
    TestReposiroty reposiroty;

    @Override
    @Transactional
    public void run(ApplicationArguments args) throws Exception {
        // CRUD 구현 :  https://dongdd.tistory.com/177
        /*
        reposiroty.findAll();             // 모든 객채 가져오기
        reposiroty.findById(2L);          // ID로 검색해서 가져오기
        reposiroty.save(new Member());    // 저장
        reposiroty.deleteAll();           // 모두삭제
        reposiroty.deleteById(2L);        // 해당 ID 삭제
        */
    }
}
