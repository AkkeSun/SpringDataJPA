package com.example.springdatajpa;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter @Setter
@Entity // 해당 클래스와 동일한 테이블과 매핑하겠다
public class Account {

    @Id @GeneratedValue
    private Long id;
    private String username;
    private String password;

}
