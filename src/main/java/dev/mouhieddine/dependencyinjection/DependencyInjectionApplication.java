package dev.mouhieddine.dependencyinjection;

import dev.mouhieddine.dependencyinjection.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication // will scan only components under this package

public class DependencyInjectionApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(DependencyInjectionApplication.class, args);

        MyController myController = (MyController) ctx.getBean("myController");



    }

}
