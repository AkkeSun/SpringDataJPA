package com.example.springdatajpa.F__JpaRepository.auditing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AuditingRunner implements ApplicationRunner {

    @Autowired
    AuditingRepository1 repository;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        AuditingEntity1 savedObject = repository.save(new AuditingEntity1("test"));
        System.out.print(savedObject.toString());
        System.out.print("======================================");

        savedObject.setId(1L);
        savedObject.setTitle("test2");
        AuditingEntity1 savedObject2 = repository.save(savedObject);
        System.out.print(savedObject2.toString());

    }
}
