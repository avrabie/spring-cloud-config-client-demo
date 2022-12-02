package com.example.demo.configclientdemo.runners;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class IakaRunner implements ApplicationRunner {
    private final Environment environment;

    public IakaRunner(Environment environment) {
        this.environment = environment;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("This is the message :: "+environment.getProperty("cnj.message"));
    }
}
