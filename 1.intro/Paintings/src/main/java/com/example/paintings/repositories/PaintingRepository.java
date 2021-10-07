package com.example.paintings.repositories;

import com.example.paintings.Controllers.Paintings;
import com.example.paintings.models.Painting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PaintingRepository extends JpaRepository<Painting, Long> {

     List<Painting> findPaintingByArtistAndYear(String artistName, int year);

     @Query(value="SELECT * FROM paintings WHERE price > ?", nativeQuery = true)
     List<Painting> getPaintingAboveACertainPrice(double price);
}
