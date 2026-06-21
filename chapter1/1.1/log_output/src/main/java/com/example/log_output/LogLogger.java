package com.example.log_output;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import java.util.UUID;

@Component
public class LogLogger {
    // Generated firmly inside memory on startup
    private final String randomString = UUID.randomUUID().toString();

    // Runs every 5000 milliseconds (5 seconds)
    @Scheduled(fixedRate = 5000)
    public void logOutput() {
        // Bypasses logging libraries to print cleanly to standard console out
        System.out.println(randomString);
    }
}