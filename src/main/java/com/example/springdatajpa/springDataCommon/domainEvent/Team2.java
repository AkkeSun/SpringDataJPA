package com.example.springdatajpa.springDataCommon.domainEvent;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.domain.AbstractAggregateRoot;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Setter @Getter
public class Team2 extends AbstractAggregateRoot<Team2> {

    @Id @GeneratedValue
    private Long id;

    private String name;

    public Team2 publish() {
        this.registerEvent(new TeamPublishedEvent(this));
        return this;
    }

}
