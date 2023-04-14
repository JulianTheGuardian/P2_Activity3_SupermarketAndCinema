/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes.clases_cinema;

/**
 *
 * @author LabSispc14
 */
public class Function {
    
    private Movie movie;
    private Cinema_Room cinemaRoom;
    private String startTime;
    private String finalTime;
    private String date;
    private String id;

    @Override
    public String toString() {
        return "Function{" + "movie=" + movie + ", cinemaRoom=" + cinemaRoom + ", startTime=" + startTime + ", finalTime=" + finalTime + ", date=" + date + ", id="+ id +'}';
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public void setCinemaRoom(Cinema_Room cinemaRoom) {
        this.cinemaRoom = cinemaRoom;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public void setFinalTime(String finalTime) {
        this.finalTime = finalTime;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public Movie getMovie() {
        return movie;
    }

    public Cinema_Room getCinemaRoom() {
        return cinemaRoom;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getFinalTime() {
        return finalTime;
    }

    public String getDate() {
        return date;
    }

    public Function(Movie movie, Cinema_Room cinemaRoom, String startTime, String finalTime, String date, String id) {
        this.movie = movie;
        this.cinemaRoom = cinemaRoom;
        this.startTime = startTime;
        this.finalTime = finalTime;
        this.date = date;
        this.id = id;
    }

    public Function() {
    }
}
