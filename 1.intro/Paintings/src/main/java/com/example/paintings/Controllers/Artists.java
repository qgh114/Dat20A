package com.example.paintings.Controllers;

import com.example.paintings.models.Artist;
import com.example.paintings.repositories.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class Artists {

    @Autowired
    ArtistRepository artists;


    @GetMapping("/artists")
    public Iterable<Artist> getArtists(){

        return artists.findAll();
    }


    @GetMapping("/artists/{id}")
    public Artist getArtistsById(@PathVariable Long id){
        return artists.findById(id).get();
    }

    //Adds painting
    @PostMapping("/artists")
    public Artist addArtists(@RequestBody Artist newartist){

        return artists.save(newartist);
    }

    //Updates painting by id
    @PutMapping("/artists/{id}")
    public void updateArtistsById(@PathVariable Long id, @RequestBody Artist artistToUpdate){
        artists.findById(id).map(foundArtist ->{
            foundArtist.setName(artistToUpdate.getName());
            foundArtist.setAge(artistToUpdate.getAge());
            foundArtist.setNationality(artistToUpdate.getNationality());
            foundArtist.setPrimaryStyle(artistToUpdate.getPrimaryStyle());
            foundArtist.setGender(artistToUpdate.getGender());

            artists.save(foundArtist);
            return "Artist updated";
        }).orElse("Artist not found");


    }

    //Deletes painting by id
    @DeleteMapping("/artists/{id}")
    public void deleteArtistsById(@PathVariable Long id){
        artists.deleteById(id);
    }
/*
    //updates some info painting by id
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
