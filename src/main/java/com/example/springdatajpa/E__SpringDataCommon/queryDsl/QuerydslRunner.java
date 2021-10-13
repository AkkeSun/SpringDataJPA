package com.example.springdatajpa.E__SpringDataCommon.queryDsl;

import com.example.springdatajpa.E__SpringDataCommon.queryDsl.repository.Entity1Repository;
import com.example.springdatajpa.E__SpringDataCommon.queryDsl.repository.Entity2Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component
@Transactional
public class QuerydslRunner implements ApplicationRunner {

    @Autowired
    Entity1Repository repository1;

    @Autowired
    Entity2Repository repository2;

    @Override
    public void run(ApplicationArguments args) throws Exception {

         /*
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


        // ex1) List Return
        List<TestEntity1> list = repository1.findAllInnerFetchJoin("ent1");
        list.forEach(System.out::println);


        // ex2) Page Return
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


        // ex3) sub Query Test
        List<String> result = repository1.subQueryTest("ent2");
        result.forEach(System.out::println);

         */
    }
}

