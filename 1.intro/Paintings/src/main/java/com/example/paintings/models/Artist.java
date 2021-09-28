package com.example.paintings.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="artists")
@Entity
public class Artist {
    @Id
    @Column
    private long id;

    @Column
    private String name;

    @Column
    private int age;

    @Column
    private String primaryStyle;

    @Column(length=45)
    private String nationality;

    @Column
    private Gender gender;


}
