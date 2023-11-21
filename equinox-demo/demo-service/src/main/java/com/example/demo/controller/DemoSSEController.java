package com.example.demo.controller;

import com.example.demo.api.DemoSSEApi;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

import java.io.IOException;

@Controller
public class DemoSSEController implements DemoSSEApi {

    @Override
    public SseEmitter get() {
        SseEmitter sseEmitter = new SseEmitter();

        Thread.startVirtualThread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    sseEmitter.send(System.currentTimeMillis());
                    Thread.sleep(1000);
                } catch (IOException | InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            sseEmitter.complete();
        });
        return sseEmitter;
    }
    @Override
    public SseEmitter post() {
        return null;
    }

}
