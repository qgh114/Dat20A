package com.example.trash_api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PokemonController {

    public ArrayList listofp(){
        ArrayList<String> plist = new ArrayList<String>();
        plist.add("Pikachu");
        plist.add("Alakazam");
        plist.add("Aggron");
        return plist;
    }

    @GetMapping("/pokemon/go")
    public boolean pokemon(){

      return true;
    };



    @GetMapping("/pokemon")
    public List plist(){

        return listofp();
    }

}
