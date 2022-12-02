package com.example.demo.configclientdemo.controllers;

import com.example.demo.configclientdemo.domain.Fire;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/fire")
public class FireController {
    @GetMapping("/get")
    public Flux<Fire> getFire(){
        return Flux.just(new Fire(1, "don't"), new Fire(2, "Dodon"));
    }


}
