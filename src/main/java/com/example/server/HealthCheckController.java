package com.example.server;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HealthCheckController {
    @GetMapping("/")
    public String check(){
        log.info("server is running...");
        return "server is running...";
    }
}
