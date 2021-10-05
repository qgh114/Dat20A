package com.example.paintings.repositories;

import com.example.paintings.Controllers.Paintings;
import com.example.paintings.models.Painting;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaintingRepository extends JpaRepository<Painting, Long> {
}
