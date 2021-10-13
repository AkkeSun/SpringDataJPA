package com.example.springdatajpa.A__Basic;

import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Setter
@Entity(name = "Account") // Java에서 객채 명 (default = 클래스명)
@Table(name = "Account")  // DB 테이블명. 생략가능 (default = Entity명)
public class Account {

    /************************************
    @Id
        Primary Key 필드 지정

    @GeneratedValue
        Primary Key의 기본값을 자동생성할 때 사용
        GenerationType.AUTO : DB 방언에 따라 자동지정 (default)
        GenerationType.SEQUENCE : DB 시퀀스를 이용해서 키 값 생성
        GenerationType.IDENTITY : DB에 키 생성방법을 위임

     @Column
        생략가능. 컬럼의 추가 제약을 줄 때 지정

     @Temporal
        날짜와 시간 타입을 매핑할 때 사용
        현재 JPA2.1까지는 Date와 Calendar만 사용 가능

     @CreationTimestamp
        INSERT 시 자동으로 값을 채워줌

     @UpdateTimestamp
        UPDATE시 자동으로 값을 채워줌

     @Transient
        컬럼으로 맵핑하고 싶지않은 변수 선언
     ***************************************/

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column(name = "seq")
    private Long seq;

    @Column(name = "username", nullable = false, unique = true)
    private String username;

    @Column (name="password", nullable = false)
    private String password;

    @Temporal(TemporalType.DATE)
    private Date date;

    @CreationTimestamp
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Transient
    private String secret;

}
