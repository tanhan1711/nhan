package com.example.demo.model;

import jdk.jfr.Name;

import javax.persistence.*;

@Entity

public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",columnDefinition = "integer")
    private int id;
    @Column(name = "name",columnDefinition = "VARCHAR(100)",nullable = false)
    private String name;
    @Column(name = "artist",columnDefinition = "VARCHAR(100)",nullable = false)
    private String artist;
    @Column(name = "category",columnDefinition = "VARCHAR(100)",nullable = false)
    private String category;
    @Column(name = "link",columnDefinition = "VARCHAR(100)",nullable = false)
    private String link;

    public Song(int id, String name, String artist, String category, String link) {
        this.id = id;
        this.name = name;
        this.artist = artist;
        this.category = category;
        this.link = link;
    }

    public Song() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
