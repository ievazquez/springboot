package com.example.eventdriven.model;

public class AuditEvent {
        private String name;

        public AuditEvent(String name) {
            this.name = name;
        }

        public String getName(){
            return this.name;
        }
}
