package com.example.ctpocbend1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AAA {

    @GetMapping("/")
    String home() {
        return "Hello, World!";
    }

}