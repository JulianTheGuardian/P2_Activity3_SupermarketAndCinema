/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes.clases_supermarket;

/**
 *
 * @author LabSispc14
 */
public class Client {
    private String name;
    private String dni;
    private String mail;
    private int points;

    @Override
    public String toString() {
        return "Client{" + "name=" + name + ", dni=" + dni + ", mail=" + mail + ", points=" + points + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public Client(String name, String dni, String mail, int points) {
        this.name = name;
        this.dni = dni;
        this.mail = mail;
        this.points = points;
    }

    public Client() {
    }
}
