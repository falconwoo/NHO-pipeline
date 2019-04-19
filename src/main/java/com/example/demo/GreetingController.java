package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/api/greeting")
public class GreetingController {

    private static final String GREETING = "hello, ";

    @GetMapping()
    public String greeting(@RequestParam("name") String name) {
        return GREETING + name;
    }
}
