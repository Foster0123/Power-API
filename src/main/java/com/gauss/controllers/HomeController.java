package com.gauss.controllers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gauss.api.Api;

@RestController
public class HomeController {
    private static final String template = "Hello, %s";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greet")
    public Api greeting (@RequestParam(value = "name", defaultValue = "World") String name){
        return new Api(counter.incrementAndGet(), String.format(template, name));
    }
}