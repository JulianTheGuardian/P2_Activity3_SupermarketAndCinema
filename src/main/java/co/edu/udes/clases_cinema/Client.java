/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes.clases_cinema;

/**
 *
 * @author LabSispc14
 */
public class Client {
    
    private String name;
    private String id;
    private boolean cinemaCard;

    public Client() {
    }

    @Override
    public String toString() {
        return "Client{" + "name=" + name + ", id=" + id + ", cinemaCard=" + cinemaCard + '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCinemaCard(boolean cinemaCard) {
        this.cinemaCard = cinemaCard;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public boolean isCinemaCard() {
        return cinemaCard;
    }

    public Client(String name, String id, boolean cinemaCard) {
        this.name = name;
        this.id = id;
        this.cinemaCard = cinemaCard;
    }
}
