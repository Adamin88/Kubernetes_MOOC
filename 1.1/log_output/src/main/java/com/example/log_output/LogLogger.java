package com.example.log_output;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import java.util.UUID;

@Component
public class LogLogger {
    private final String randomString = UUID.randomUUID().toString();

    @Scheduled(fixedRate = 5000)
    public void logOutput() {

        System.out.println(randomString);
    }
}