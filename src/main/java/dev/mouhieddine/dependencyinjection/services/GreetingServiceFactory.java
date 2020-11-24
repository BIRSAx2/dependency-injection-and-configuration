package dev.mouhieddine.dependencyinjection.services;

public class GreetingServiceFactory {

    private final GreetingRepository greetingRepository;

    public GreetingServiceFactory(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public GreetingService createGreetingService(String lang) {

        return switch (lang) {
            case "en" -> new PrimaryGreetingService(greetingRepository);
            case "de" -> new PrimaryGermanGreetingService(greetingRepository);
            case "es" -> new PrimarySpanishGreetingService(greetingRepository);
            default -> new PrimaryGreetingService(greetingRepository);
        };

    }
}
