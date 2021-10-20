package com.example.springdatajpa.F__JpaRepository.Specifications.join;
import com.example.springdatajpa.F__JpaRepository.Specifications.baisic.SpecEntity;
import com.example.springdatajpa.F__JpaRepository.Specifications.baisic.SpecEntity_;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.Join;
import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.Predicate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class JoinSpecs {

    // 기본 Join
    // 자식 Entity로 검색하는것만 가능. 부모 Entity로 검색해서 가져오려면 그냥 root로 검색해야함 (Fetch.Join)
    public static Specification<JoinSpecEntity1> JoinExample1(String title){
        return (root, query, cb) -> {
            Join<JoinSpecEntity1, JoinSpecEntity2> join = root.join("joinSpecEntity2", JoinType.INNER);
            return cb.equal(join.get("title"), title);
        };
    }

    public static Specification<JoinSpecEntity1> JoinExample2(String title){
        return (root, query, cb) -> cb.equal(root.get("title"), title);
    }



    // 검색조건을 Util로 만들어 쓰기
    public static Specification<JoinSpecEntity1> UtilSpecs(Map<String, Object> filter) {
        return (root, query, cb) -> {
            List<Predicate> predicates = new ArrayList<>();

            filter.forEach((key, value) -> {
                String likeValueString = "%" + value + "%";
                switch (key) {
                    case "title":
                        predicates.add(cb.like(root.get(key).as(String.class), likeValueString));
                        break;

                    case "count":
                        predicates.add(cb.equal(root.get(key).as(Long.class), value));
                        break;
                }
            });
            return cb.and(predicates.toArray(new Predicate[0]));
        };
    }

}
