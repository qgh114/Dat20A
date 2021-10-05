package com.example.paintings.repositories;

import com.example.paintings.models.Artist;
import com.example.paintings.models.Gallery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface GalleryRepository extends JpaRepository<Gallery, Long> {
}
