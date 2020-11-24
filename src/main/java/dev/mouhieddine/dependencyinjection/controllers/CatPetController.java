package dev.mouhieddine.dependencyinjection.controllers;

import dev.mouhieddine.dependencyinjection.services.PetService;
import org.springframework.stereotype.Controller;

@Controller
public class CatPetController {
    private PetService petService;

    public CatPetController(PetService petService) {
        this.petService = petService;
    }

    public String getPetName(){
        return petService.sayPetName();
    }
}
