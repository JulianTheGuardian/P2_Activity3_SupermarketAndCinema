/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes.clases_cinema;

/**
 *
 * @author LabSispc14
 */
public class Chair {
    
    private String idChair;
    private boolean bought;
    private boolean premium;
    private double price;

    @Override
    public String toString() {
        return "Chair{" + "idChair=" + idChair + ", bought=" + bought + ", premium=" + premium + ", price=" + price +'}';
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setIdChair(String idChair) {
        this.idChair = idChair;
    }

    public void setBought(boolean bought) {
        this.bought = bought;
    }

    public void setPremium(boolean premium) {
        this.premium = premium;
    }

    public double getPrice() {
        return price;
    }

    public String getIdChair() {
        return idChair;
    }

    public boolean isBought() {
        return bought;
    }

    public boolean isPremium() {
        return premium;
    }

    public Chair(String idChair, boolean bought, boolean premium, double price) {
        this.idChair = idChair;
        this.bought = bought;
        this.premium = premium;
        this.price = price;
    }

    public Chair() {
    }
}
