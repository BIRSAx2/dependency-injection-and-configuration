package dev.mouhieddine.dependencyinjection.controllers;

import dev.mouhieddine.dependencyinjection.services.GreetingService;

public class PropertyInjectedController {
    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
