package dev.mouhieddine.dependencyinjection;

import dev.mouhieddine.dependencyinjection.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication // will scan only components under this package
@ComponentScan(basePackages = {"dev.mouhieddine.services","dev.mouhieddine.dependencyinjection"}) // will search from this packages down

public class DependencyInjectionApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(DependencyInjectionApplication.class, args);

//        System.out.println("<--- Primary bean --->");

        MyController myController = (MyController) ctx.getBean("myController");
        System.out.println(myController.sayHello());

        System.out.println(ctx.getBean(PropertyInjectedController.class).getGreeting());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).getGreeting());
        System.out.println(ctx.getBean(SetterInjectedController.class).getGreeting());
        /*System.out.println("<--- Property Based Injection --->");
        // we have to annotate PropertyInjectedController as a Spring managed Controller
        // we have to annotate the greetingService dependency with @Autowired to tell Spring to Inject and instance of GreetingService
        // we have to annotate the GreetingServiceImpl with @Service to make it a Spring managed Service
        // there is no effective difference between Service, Controller and Component annotations
        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGreeting());


        System.out.println("<--- Setter Based Injection --->");

        SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
        System.out.println(setterInjectedController.getGreeting());

        System.out.println("<--- Constructor Based Injection --->");

        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.getGreeting());

        System.out.println("<--- Spring profiles --->");

        I18nController i18nController = (I18nController) ctx.getBean("i18nController");
        System.out.println(i18nController.sayHello());

        System.out.println("<--- Pet Service --->");

        CatPetController catPetController = (CatPetController) ctx.getBean("catPetController");
        System.out.println(catPetController.getPetName());*/


    }

}
