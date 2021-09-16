package com.example.trash_api.controllers;

import com.example.trash_api.Model.SuperMarioCharacter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Random;

@RestController

public class SuperMarioController {

    Random random = new Random();

    @GetMapping("/supermario/characters")
    public String supermario(){

        ArrayList<String> characters = new ArrayList<String>();
        characters.add("Mario");
        characters.add("Luigi");
        characters.add("Toad");
        characters.add("Wario");





        /*SuperMarioCharacter charcter = new SuperMarioCharacter();
        charcter.character();

         */
        String character = characters.get(random.nextInt(4));

        return character;
    };
}
