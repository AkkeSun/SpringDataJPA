package com.example.springdatajpa.E__SpringDataCommon.domainEvent;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class TeamPublishedEvent extends ApplicationEvent{

    private final Team2 teams;

    public TeamPublishedEvent(Object source) {
        super(source);
        this.teams = (Team2) source;
    }

    public Team2 getTeams() {
        return teams;
    }
}
