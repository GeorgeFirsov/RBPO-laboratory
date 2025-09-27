package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello_controller {

    @GetMapping("/hello")
    public String hello() {
        return "Привет! Spring Boot работает 🙂";
    }

    @GetMapping("/greet")
    public String greet(String name) {
        return "Здравствуйте, " + (name == null ? "гость" : name) + "!";
    }
}
