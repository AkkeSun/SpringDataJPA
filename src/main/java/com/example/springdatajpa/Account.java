package com.example.springdatajpa;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter @Setter
@Entity(name = "Account") // Java에서 객채 명 (default = 클래스명)
@Table(name = "Account")  // DB 테이블명. 생략가능 (default = Entity명)
public class Account {

    /*
    @Id
        Primary Key 필드 지정

    @GeneratedValue
        Primary Key의 기본값을 자동생성할 떄 사용
        GenerationType.AUTO : DB 방언에 따라 자동지정 (default)
        GenerationType.SEQUENCE : DB 시퀀스를 이용해서 키 값 생성
        GenerationType.IDENTITY : DB에 키 생성방법을 위임

     @Column
        생략가능. 컬럼의 추가 제약을 줄 때 지정

     @Temporal
        날짜와 시간 타입을 매핑할 때 사용
        현재 JPA2.1까지는 Date와 Calendar만 사용 가능

    @Transient
        컬럼으로 맵핑하고 싶지않은 변수 선언
     */

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column
    private String password;

    @Temporal(TemporalType.DATE)
    private Date date;

    @Transient
    private String secret;
}
