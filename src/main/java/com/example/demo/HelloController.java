package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;


@RestController
public class HelloController {

    @RequestMapping("hello")
    public String a(){
        return Instant.now().toString();
    }
}
