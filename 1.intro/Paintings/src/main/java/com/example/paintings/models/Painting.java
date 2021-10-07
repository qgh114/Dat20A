package com.example.paintings.models;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;

@Data
@Table(name="paintings")
@Entity
public class Painting {

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
    @ApiModelProperty(notes = "Name of the artist")
    private String artist;

    @Column
    private int price;

    @Column
    private String title;

    @Column
    private String genre;

    @Column
    private int year;








    /*
        private String artist;
        private double price;
        private String title;
        private String genre;
        private int year;

        public Painting(String artist, double price, String title, String genre, int year) {
            this.artist = artist;
            this.price = price;
            this.title = title;
            this.genre = genre;
            this.year = year;
        }

        public Painting(){};


        public Painting(String artist){
            this.artist = artist;
        }



        public String getArtist() {
            return artist;
        }
        public void setArtist(String artist) {
            this.artist = artist;
        }
        public double getPrice() {
            return price;
        }
        public void setPrice(double price) {
            this.price = price;
        }
        public String getTitle() {
            return title;
        }
        public void setTitle(String title) {
            this.title = title;
        }
        public String getGenre() {
            return genre;
        }
        public void setGenre(String genre) {
            this.genre = genre;
        }
        public int getYear() {
            return year;
        }
        public void setYear(int year) {
            this.year = year;
        }

 */

}

