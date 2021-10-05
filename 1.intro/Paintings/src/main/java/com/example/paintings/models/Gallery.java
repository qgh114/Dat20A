package com.example.paintings.models;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Table(name="galleries")
@Entity
public class Gallery {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)

   @Column
    private long id;

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    @Column
    private String owner;

    @Column
    private String name;

    @Column
    private String location;

    @Column
    private int squareFeet;

    //FetchType.LAZY henter kun data når den har brug for det. CASCADETYPE måden tabellerne fungerer sammen altså fx når der bliver slette osv
    @OneToMany(mappedBy = "gallery", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Artist> artists;


}
