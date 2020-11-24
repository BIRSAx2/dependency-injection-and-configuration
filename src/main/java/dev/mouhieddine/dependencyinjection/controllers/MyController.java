package dev.mouhieddine.dependencyinjection.controllers;

import dev.mouhieddine.services.GreetingService;
import org.springframework.stereotype.Component;

@Component
public class MyController {

    private final GreetingService greetingService;

    // @Qualifier not specified -> Spring will inject the service/bean annotated with @Primary
    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
