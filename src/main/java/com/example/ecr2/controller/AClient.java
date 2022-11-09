package com.example.ecr2.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value="example", url = "k8s-hello-testingr-db50395e52-753162095.ap-northeast-2.elb.amazonaws.com/A")
public interface AClient {
    @GetMapping("/")
    String getA();
}
