package com.example.springdatajpa.springDataCommon.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component
public class CurdRunner implements ApplicationRunner {

    @Autowired
    CrudService crudService;

    @Override
    @Transactional
    public void run(ApplicationArguments args) throws Exception {

        /*
        // INSERT TEST
        Member member = new Member();
        member.setTeamName("Korea");
        member.setUsername("test3");

        Member result1 = crudService.save(member);
        System.err.println(result1.toString());
        */

        // PAGE TEST
        /*
        Page <Member> page =
                crudService.getPagesForRunner("Japan", 0, 2, "id", "");
        int totalPages = page.getTotalPages();
        int nowPage = page.getNumber();
        Long totalElement = page.getTotalElements();
        List<Member> members = page.getContent();

        System.err.println("총 페이지 수 : " + totalPages);
        System.err.println("총 데이터 수 : " + totalElement);
        System.err.println("현재 페이지  : " + nowPage);
        members.forEach(System.out::println);
         */


    }
}
