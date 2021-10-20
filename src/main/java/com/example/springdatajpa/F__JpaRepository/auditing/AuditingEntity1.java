package com.example.springdatajpa.F__JpaRepository.auditing;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter @Setter
@NoArgsConstructor
public class AuditingEntity1 extends BaseEntity{

    @Id @GeneratedValue
    private Long id;

    private String title;

    public AuditingEntity1(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "id : "+ id + " / title : " + title  + " / createDate : " + getCreatedDate()
                + " / updateDate : " + getModifiedDate()  + " / createBy : " + getCreatedBy()
                + " / updateBy : " + getModifiedBy();
    }
}
