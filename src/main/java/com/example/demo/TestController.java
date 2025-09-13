package com.example.demo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@CrossOrigin(origins = "*")
public class TestController {
    @GetMapping("/api/test")
    public Map<String, String> test(@RequestHeader Map<String, String> headers) {
        return headers;
    }
}
