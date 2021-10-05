package com.example.paintings.Controllers;

import com.example.paintings.models.Artist;
import com.example.paintings.models.Gallery;
import com.example.paintings.repositories.ArtistRepository;
import com.example.paintings.repositories.GalleryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Column;

public class Galleries {
    @Autowired
    GalleryRepository galleries;


    @GetMapping("/galleries")
    public Iterable<Gallery> getGalleries(){

        return galleries.findAll();
    }


    @GetMapping("/galleries/{id}")
    public Gallery getGalleriessById(@PathVariable Long id){
        return galleries.findById(id).get();
    }

    //Adds painting
    @PostMapping("/galleries")
    public Artist addArtists(@RequestBody Galleries newgallery){

        return null; /*galleries.save(newgallery);*/
    }

    //Updates painting by id
    @PatchMapping("/galleries/{id}")
    public void patchArtistsById(@PathVariable Long id, @RequestBody Gallery galleryToUpdate) {
        galleries.findById(id).map(foundGallery -> {
            if (galleryToUpdate.getName() != null) foundGallery.setName(galleryToUpdate.getName());
            if (galleryToUpdate != null) foundGallery.setSquareFeet(galleryToUpdate.getSquareFeet());
            if (galleryToUpdate.getLocation() != null) foundGallery.setLocation(galleryToUpdate.getLocation());
            if (galleryToUpdate.getOwner() != null) foundGallery.setOwner(galleryToUpdate.getOwner());

            galleries.save(foundGallery);
            return "Gallery updated";
        }).orElse("Gallery not found");

    }

    //Deletes painting by id
    @DeleteMapping("/galleries/{id}")
    public void deleteGalleriessById(@PathVariable Long id){
        galleries.deleteById(id);
    }


}
