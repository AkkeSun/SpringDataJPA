package com.example.springdatajpa.F__JpaRepository.auditing;

import lombok.Getter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

@Getter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseEntity extends BaseTimeEntity{

    // 작성자
    @CreatedBy
    @ManyToOne
    private AuditingEntity2 createdBy;

    // 수정자
    @LastModifiedBy
    @ManyToOne
    private AuditingEntity2 modifiedBy;

}
