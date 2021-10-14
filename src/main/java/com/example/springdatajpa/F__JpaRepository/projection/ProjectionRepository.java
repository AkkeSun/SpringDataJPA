package com.example.springdatajpa.F__JpaRepository.projection;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProjectionRepository extends JpaRepository<ProjectionEntity, Long> {

    // 여러 인터페이스를 호출하여 사용할것을 생각해 제네릭 타입으로 셋팅
    <T> List<T> findByData4(String data4, Class<T> type);
}
