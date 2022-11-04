package com.example.ecr2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class TestController {

    @GetMapping
    public Map<String, String> test() {
        Map<String, String> test = new HashMap<>();
        test.put("asd", "asd");
        return test;
    }
}
