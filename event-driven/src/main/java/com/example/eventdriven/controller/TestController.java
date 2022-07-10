package com.example.eventdriven.controller;

import com.example.eventdriven.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class TestController {
    @Autowired
    private UserService service;

    @PostMapping("/adduser")
    public String addUser(@RequestBody Map<String,String> request) {
        this.service.addUser(request.get("name"));

        return "success";
    }
}
