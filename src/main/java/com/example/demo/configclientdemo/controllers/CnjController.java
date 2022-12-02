package com.example.demo.configclientdemo.controllers;

import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class CnjController {

    private final Environment environment;

    public CnjController(Environment environment) {
        this.environment = environment;
    }

    @GetMapping("/cnj")
    Flux<String> getCnjMessages() {
       return Flux.just(environment.getProperty("cnj.message"), environment.getProperty("cnj.name"));
    }
}
