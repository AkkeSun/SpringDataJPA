package com.example.springdatajpa.springDataCommon.domainEvent;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class  TeamListener {

    @EventListener
    public void onApplicationEvent(TeamPublishedEvent event) {
        System.out.println("==========================");
        System.out.println(event.getTeams().getName());
        System.out.println("==========================");
    }
}
