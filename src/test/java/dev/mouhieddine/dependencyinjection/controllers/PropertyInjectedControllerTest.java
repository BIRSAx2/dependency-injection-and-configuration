package dev.mouhieddine.dependencyinjection.controllers;

import dev.mouhieddine.dependencyinjection.services.ConstructorInjectedGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {

    public PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        // manual property injection using properties -> least preferred way to do DI
        controller = new PropertyInjectedController();
        controller.greetingService = new ConstructorInjectedGreetingService();
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}