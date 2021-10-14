package com.example.springdatajpa.F__JpaRepository.projection;


public interface ProjectionSummary {
    // 가져올 컬럼 getter
    String getData1();
    String getData2();
    String getData3();

    // 가져온 데이터를 바탕으로 새로운 데이터 생성도 가능
    default String getMyData(){
        return getData1() + " " + getData2();
    }

}
