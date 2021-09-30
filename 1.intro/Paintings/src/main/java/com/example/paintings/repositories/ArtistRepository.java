package com.example.paintings.repositories;

import com.example.paintings.models.Artist;
import org.springframework.data.repository.CrudRepository;

public interface ArtistRepository extends CrudRepository<Artist, Long> {

}
