package com.example.coffee_demo.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

//@Getter
//@Setter
@Data
public class Coffee {
    private final String id;
    private String name;


    public Coffee(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Coffee ( String name) {
        this(UUID.randomUUID().toString(),name);
    }

}

