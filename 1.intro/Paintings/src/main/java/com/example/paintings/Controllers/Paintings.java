package com.example.paintings.Controllers;

import com.example.paintings.models.Painting;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class Paintings {

    public ArrayList<Painting> paintings = new ArrayList<>();

    //Returns every Painting
    @GetMapping("/paintings")
    public ArrayList<Painting> getPaintings(){
        return paintings;
    }

    //Gets painting by id
    @GetMapping("/paintings/{id}")
    public Painting getPaintingsById(@PathVariable int id){
        return paintings.get(id);
    }

    //Adds painting
    @PostMapping("/paintings")
    public Painting addPaintings(@RequestBody Painting painting){
        paintings.add(painting);

        return painting;
    }

    //Updates painting by id
   @PutMapping("/paintings/{id}")
    public Painting putPaintingsById(@PathVariable int id, @RequestBody Painting painting){
        return paintings.set(id,painting);
    }

    //Deletes painting by id
    @DeleteMapping("/paintings/{id}")
    public Painting deletePaintingsById(@PathVariable int id){
        return paintings.remove(id);
    }

    //uodates some info painting by id
    @PatchMapping("/paintings/{id}")
    public Painting patchPainting(@PathVariable int id, @RequestBody String body) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            Painting newPainting = mapper.readValue(body, Painting.class);
            paintings.set(id, newPainting);
            return newPainting;
        } catch (JsonProcessingException error) {
            System.out.println(error);
            Painting unknownPainting = new Painting("Unknown");
            paintings.set(id, unknownPainting);
            return unknownPainting;
        }
    }





}
