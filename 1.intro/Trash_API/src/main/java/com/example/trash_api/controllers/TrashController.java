package com.example.trash_api.controllers;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

    public List<String> Arrsins(){
        ArrayList<String> sins = new ArrayList<String>();
        sins.add("Lust");
        sins.add("Greed");
        sins.add("Sloth");
        sins.add("Wrath");
        sins.add("Envy");
        sins.add("Pride");
        sins.add("Gluttony");
        return sins;
    }


    @GetMapping("/deadly-sins/{id}")
    public String sins(@PathVariable int id){
        try {
            return Arrsins().get(id);
        } catch (Exception error){
            return "Not sinned";
        }

        /*if(id>7 || id<=0){
            return "out of scope";
        }

         */


       // Random random = new Random();

       // String sin = sins.get(random.nextInt(7));

       // return Arrsins().get(id);

}

@GetMapping("/trash")
    public String trash(@RequestParam String trash){

        return trash;

}

@PostMapping("/rubbishbin")
    public String throwOutRubbish(@RequestBody String everything){
    System.out.println(everything);
        return "Everything went well";
}





}
