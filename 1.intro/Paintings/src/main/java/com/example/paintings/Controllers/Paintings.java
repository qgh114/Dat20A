package com.example.paintings.Controllers;

import com.example.paintings.models.Artist;
import com.example.paintings.models.Painting;
import com.example.paintings.repositories.ArtistRepository;
import com.example.paintings.repositories.PaintingRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Api(value = "Paintings controller", description = "REST endpoints for paintings" )
@RestController
public class Paintings {


    @Autowired
    PaintingRepository paintings;


    @GetMapping("/paintings")
    public Iterable<Painting> getPaintings(){

        return paintings.findAll();
    }


    @GetMapping("/paintings/{id}")
    public Painting getPaintingById(@PathVariable Long id){
        return paintings.findById(id).get();
    }

    //Adds painting
    @PostMapping("/paintings")
    public Painting addPaintings(@RequestBody Painting newpainting){

        return paintings.save(newpainting);
    }

    @GetMapping("paintings/timeline")
    public List<Painting> getPaintingByArtistAndYear(@RequestParam String artist, @RequestParam int year){
        return paintings.findPaintingByArtistAndYear(artist,year);
    }

    @GetMapping("/paintings/pricelookup/{price}")
    public List<Painting> getPaintingAboveACertainPrice(@PathVariable double price){
        
        return paintings.getPaintingAboveACertainPrice(price);    
    }



    //Updates painting by id
    @PatchMapping("/paintings/{id}")
    public void patchPaintingById(@PathVariable Long id, @RequestBody Painting paintingToUpdate){
        paintings.findById(id).map(foundPainting ->{
            if(paintingToUpdate.getArtist()!= null) foundPainting.setArtist(paintingToUpdate.getArtist());
            if(paintingToUpdate != null)foundPainting.setYear(paintingToUpdate.getYear());
            if(paintingToUpdate != null)foundPainting.setPrice(paintingToUpdate.getPrice());
            if(paintingToUpdate.getTitle()!= null)foundPainting.setTitle(paintingToUpdate.getTitle());
            if(paintingToUpdate.getGenre()!= null)foundPainting.setGenre(paintingToUpdate.getGenre());
            paintings.save(foundPainting);
            return "Painting updated";
        }).orElse("Painting not found");



    }

    @PutMapping("/paintings/{id}")
    public String updatePaintingById(@PathVariable Long id, @RequestBody Painting paintingToUpdate){
        if (paintings.existsById(id)) {
            paintingToUpdate.setId(id);
            paintings.save(paintingToUpdate);
            return "Painting was created";
        } else {
            return "Painting not found";
        }
    }

    //Deletes painting by id
    @DeleteMapping("/paintings/{id}")
    public void deletePaintingById(@PathVariable Long id){
        paintings.deleteById(id);
    }






















/*
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
            Painting unknownPainting = new Painting();
            paintings.set(id, unknownPainting);
            return unknownPainting;
        }
    }




 */


}
