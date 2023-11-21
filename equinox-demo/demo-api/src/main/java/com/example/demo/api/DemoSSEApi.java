package com.example.demo.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

public interface DemoSSEApi {

    @GetMapping("/sse/get")
    public SseEmitter get();

    @PostMapping("/sse/post")
    public SseEmitter post();

}
