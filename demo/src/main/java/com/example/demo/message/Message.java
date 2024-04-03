package com.example.demo.message;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Message {
    @GetMapping("/welcome")
    public String message()
    {
        return "Welcome";
    }
}
