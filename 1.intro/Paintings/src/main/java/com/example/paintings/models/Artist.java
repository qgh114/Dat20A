package com.example.paintings.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name="artists")
@Entity
public class Artist {
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
    private String name;

    @Column
    private int age;

    @Column
    private String primaryStyle;

    @Column(length=45)
    private String nationality;

    @Enumerated(value = EnumType.STRING)
    @Column
    private Gender gender;


}
