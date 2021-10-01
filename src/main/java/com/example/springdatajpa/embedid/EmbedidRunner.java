package com.example.springdatajpa.embedid;

import com.example.springdatajpa.basic.Account;
import org.hibernate.Session;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.Date;

@Component
public class EmbedidRunner implements ApplicationRunner {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    @Transactional
    public void run(ApplicationArguments args) throws Exception {

        Person person = new Person();
        person.setName("박선양");
        person.setPhoneNumber("010-1234-5678");

        Address homeAddress = new Address();
        homeAddress.setCity("서울");
        homeAddress.setStreet("갈현로");

        Address officeAddress = new Address();
        officeAddress.setCity("서울");
        officeAddress.setStreet("여의도");

        EmbeddedId_Test test = new EmbeddedId_Test();
        test.setHomeAddress(homeAddress);
        test.setOfficeAddress(officeAddress);

    //    entityManager.persist(test);


    }
}
