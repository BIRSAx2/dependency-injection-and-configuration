package dev.mouhieddine.dependencyinjection.services;

import org.springframework.stereotype.Service;

@Service
public class CatPetService implements PetService {
    @Override
    public String sayPetName() {
        return "Cat";
    }
}
