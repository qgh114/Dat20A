package com.example.paintings.Controllers;

import com.example.paintings.models.Painting;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class Paintings {

    public ArrayList<Painting> paintings = new ArrayList<>();

    @GetMapping("/paintings")
    public ArrayList<Painting> getPaintings(){
        return paintings;
    }

    @GetMapping("/paintings/{id}")
    public Painting getPaintingsById(@PathVariable int id){
        return paintings.get(id);
    }

    @PostMapping("/paintings")
    public Painting addPaintings(@RequestBody Painting painting){
        paintings.add(painting);

        return painting;
    }

   @PutMapping("/paintings/{id}")
    public Painting deletePaintingsById(@PathVariable int id){
        return paintings.get(id);
    }


}
