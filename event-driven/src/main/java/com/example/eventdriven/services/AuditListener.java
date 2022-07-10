package com.example.eventdriven.services;

import com.example.eventdriven.model.AuditEvent;
import com.example.eventdriven.model.UserEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class AuditListener {
    @Async
    @EventListener(classes = UserEvent.class)
    public void handler(AuditEvent event){
        System.out.println("Audit the event :"+ event.getName());
    }
}
