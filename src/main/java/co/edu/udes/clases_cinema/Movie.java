/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes.clases_cinema;

/**
 *
 * @author LabSispc14
 */
public class Movie {
    
    private String name;
    private String id;
    private String movieGenre;
    private String ageRestriction;
    private String copyright;
    private String duration;

    @Override
    public String toString() {
        return "Movie{" + "name=" + name + ", id=" + id + ", movieGenre=" + movieGenre + ", ageRestriction=" + ageRestriction + ", copyright=" + copyright + ", duration=" + duration + '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setMovieGenre(String movieGenre) {
        this.movieGenre = movieGenre;
    }

    public void setAgeRestriction(String ageRestriction) {
        this.ageRestriction = ageRestriction;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getMovieGenre() {
        return movieGenre;
    }

    public String getAgeRestriction() {
        return ageRestriction;
    }

    public String getCopyright() {
        return copyright;
    }

    public String getDuration() {
        return duration;
    }

    public Movie(String name, String id, String movieGenre, String ageRestriction, String copyright, String duration) {
        this.name = name;
        this.id = id;
        this.movieGenre = movieGenre;
        this.ageRestriction = ageRestriction;
        this.copyright = copyright;
        this.duration = duration;
    }

    public Movie() {
    }
}
