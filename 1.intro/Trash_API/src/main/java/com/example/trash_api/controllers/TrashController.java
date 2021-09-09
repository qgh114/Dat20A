package com.example.trash_api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Clock;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

@RestController
public class TrashController {

    @GetMapping("/")
    public String frontpage(){
        return "index";
    }



    @GetMapping("/clock")
    public Date showClock(){

        return new Date();
    }


    @GetMapping("/deadly-sins")
    public String sins(){
        ArrayList<String> sins = new ArrayList<String>();
        sins.add("Lust");
        sins.add("Greed");
        sins.add("Sloth");
        sins.add("Wrath");
        sins.add("Envy");
        sins.add("Pride");
        sins.add("Gluttony");

        Random random = new Random();

        String sin = sins.get(random.nextInt(7));

return sin;

}



}
