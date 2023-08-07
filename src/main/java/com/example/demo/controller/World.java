package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/hello")
public class World {

    @RequestMapping("/world")
    public String startSpringBoot() {
        return "hello world!";
    }
}

