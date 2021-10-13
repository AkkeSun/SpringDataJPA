package com.example.springdatajpa.E__SpringDataCommon.web;

import com.example.springdatajpa.E__SpringDataCommon.queryDsl.entity.TestEntity2;
import com.example.springdatajpa.E__SpringDataCommon.queryDsl.repository.Entity2Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PagedResourcesAssembler;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.PagedModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Controller
public class WebController {

    @Autowired
    Entity2Repository repository;

    @GetMapping("/post1/{id}")
    public String post1(@PathVariable("id") Long id){
        Optional<TestEntity2> entity = repository.findById(id);
        TestEntity2 result = entity.orElseThrow(IllegalAccessError::new);
        return result.getName();
    }

    // 자동으로 entity id값을 바인딩해준다
    @GetMapping("/post2/{id}")
    public String post2(@PathVariable("id") TestEntity2 entity){
        return entity.getName();
    }

    // HATEOAS : JSON 형태로 현재, 이전, 이후, 맨앞, 맨 뒤 URL을 기본 제공한다 (자세한건 REST)
    @GetMapping("/post3")
    public PagedModel<EntityModel<TestEntity2>> getResource(Pageable pageable, PagedResourcesAssembler<TestEntity2> assembler) {
        return assembler.toModel(repository.findAll(pageable));
    }
}
