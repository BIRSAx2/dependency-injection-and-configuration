package dev.mouhieddine.dependencyinjection;

import dev.mouhieddine.dependencyinjection.controllers.*;
import dev.mouhieddine.dependencyinjection.examplebeans.FakeDataSource;
import dev.mouhieddine.dependencyinjection.examplebeans.FakeJmsBroker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication // will scan only components under this package

public class DependencyInjectionApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(DependencyInjectionApplication.class, args);

        MyController myController = (MyController) ctx.getBean("myController");

        FakeDataSource fakeDataSource = (FakeDataSource) ctx.getBean(FakeDataSource.class);
        System.out.println(fakeDataSource.getUser());
        System.out.println(fakeDataSource.getUrl());

        FakeJmsBroker fakeJmsBroker = (FakeJmsBroker) ctx.getBean(FakeJmsBroker.class);
        System.out.println(fakeJmsBroker.getUser());
        System.out.println(fakeJmsBroker.getPassword());

    }

}
