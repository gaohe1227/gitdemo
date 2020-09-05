package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.util.Date;


@RestController
public class HelloController {

    @RequestMapping("hello")
    public String a(){
        System.out.println(new Date());
        return Instant.now().toString();
    }
}
