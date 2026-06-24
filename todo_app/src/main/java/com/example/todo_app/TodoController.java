package com.example.todo_app;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class TodoController {
    @GetMapping("/")
    public String home() {
        return "Todo app server is running";
    }

}
