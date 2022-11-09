package com.example.ecr2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class TestController {

    @Autowired
    private AClient aClient;

    @GetMapping("/")
    public Map<String, String> test() {
        Map<String, String> test = new HashMap<>();
        test.put("asd", "asd");
        return test;
    }

    @GetMapping("/B/A")
    public Map<String, String> getA() {
        Map<String, String> map = new HashMap<>();
        map.put("getA", aClient.getA());
        return map;
    }
}
