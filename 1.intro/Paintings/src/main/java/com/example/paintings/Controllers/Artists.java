package com.example.paintings.Controllers;

import com.example.paintings.models.Artist;
import com.example.paintings.models.Painting;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class Artists {

    public ArrayList<Artist> artists = new ArrayList<>();

    //Returns every Painting
    @GetMapping("/artists")
    public ArrayList<Artist> getArtist(){
        return artists;
    }

    //Gets painting by id
    @GetMapping("/artists/{id}")
    public Artist getArtistsById(@PathVariable int id){
        return artists.get(id);
    }

    //Adds painting
    @PostMapping("/artists")
    public Artist addArtists(@RequestBody Artist artist){
        artists.add(artist);

        return artist;
    }

    //Updates painting by id
    @PutMapping("/artists/{id}")
    public Artist putArtistsById(@PathVariable int id, @RequestBody Artist artist){
        return artists.set(id,artist);
    }

    //Deletes painting by id
    @DeleteMapping("/artists/{id}")
    public Artist deleteArtistsById(@PathVariable int id){
        return artists.remove(id);
    }
/*
    //uodates some info painting by id
    @PatchMapping("/artists/{id}")
    public Artist patchArtist(@PathVariable int id, @RequestBody String body) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            Artist newArtist = mapper.readValue(body, Artist.class);
            artists.set(id, newArtist);
            return newArtist;
        } catch (JsonProcessingException error) {
            System.out.println(error);
            Artist unknownArtist = new Artist("Unknown");
            artists.set(id, unknownArtist);
            return unknownArtist;
        }
    }

 */



}
