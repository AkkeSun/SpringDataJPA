package com.example.springdatajpa.F__JpaRepository.Specifications.baisic;
import org.springframework.data.jpa.domain.Specification;


public class Specs {

    // Category.equals("Category")
    public static Specification<SpecEntity> withCategory(String Category){
        return (root, query, builder) -> builder.equal(root.get(SpecEntity_.CATEGORY), Category);
    }

    // title Like
    public static Specification<SpecEntity> likeTitle(String title){
        return (root, query, builder) -> builder.like(root.get(SpecEntity_.TITLE), "%" + title + "%");
    }

    // count >= 10
    public static Specification<SpecEntity> count10Up(){
        return (root, query, builder) -> builder.greaterThanOrEqualTo(root.get(SpecEntity_.COUNT), 10);
    }

    // 5 <= count <= 10 (startDate, endDate 할 때 좋을듯)
    public static Specification<SpecEntity> betweenCount(){
        return (root, query, builder) -> builder.between(root.get(SpecEntity_.COUNT), 5, 10);
    }
}
