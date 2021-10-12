package com.example.springdatajpa.springDataCommon.queryDsl;

import com.example.springdatajpa.springDataCommon.queryDsl.entity.TestEntity1;
import com.example.springdatajpa.springDataCommon.queryDsl.entity.TestEntity2;
import com.example.springdatajpa.springDataCommon.queryDsl.repository.Entity1Repository;
import com.example.springdatajpa.springDataCommon.queryDsl.repository.Entity2Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.List;

@Component
@Transactional
public class QuerydslRunner implements ApplicationRunner {

    @Autowired
    Entity1Repository repository1;

    @Autowired
    Entity2Repository repository2;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        repository2.saveAll(Arrays.asList(
                new TestEntity2("ent1"),
                new TestEntity2("ent2")
        ));

        repository1.saveAll(Arrays.asList(
                new TestEntity1("a", repository2.findByName("ent1")),
                new TestEntity1("b", repository2.findByName("ent1")),
                new TestEntity1("c", repository2.findByName("ent2")),
                new TestEntity1("d", repository2.findByName("ent2"))
        ));

        /*
        List<TestEntity1> list = repository1.findAllInnerFetchJoin("ent1");
        list.forEach(System.out::println);
         */

        Pageable pageable = PageRequest.of(0,2);
        Page<TestEntity1> page = repository1.findPages("ent2", pageable);
        int totalPages = page.getTotalPages();
        int nowPage = page.getNumber();
        Long totalElement = page.getTotalElements();
        List<TestEntity1> members = page.getContent();

        System.err.println("총 페이지 수 : " + totalPages);
        System.err.println("총 데이터 수 : " + totalElement);
        System.err.println("현재 페이지  : " + nowPage);
        members.forEach(System.err::println);

    }
}

