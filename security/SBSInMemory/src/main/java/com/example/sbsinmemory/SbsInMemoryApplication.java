package com.example.sbsinmemory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// How to test
// curl -v -u bill:12345 http://localhost:8080/hello
@SpringBootApplication
public class SbsInMemoryApplication {

    public static void main(String[] args) {
        SpringApplication.run(SbsInMemoryApplication.class, args);
    }

}
