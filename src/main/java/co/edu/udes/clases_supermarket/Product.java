/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes.clases_supermarket;

import java.util.Date;

/**
 *
 * @author LabSispc14
 */
public class Product {
    private double price;
    private String barCode;
    private String name;
    private boolean available;
    private String dueDate;
    private String expeditionDate;

    @Override
    public String toString() {
        return "Product{" + "price=" + price + ", barCode=" + barCode + ", name=" + name + ", available=" + available + ", dueDate=" + dueDate + ", expeditionDate=" + expeditionDate + '}';
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getExpeditionDate() {
        return expeditionDate;
    }

    public void setExpeditionDate(String expeditionDate) {
        this.expeditionDate = expeditionDate;
    }

    public Product(double price, String barCode, String name, boolean available, String dueDate, String expeditionDate) {
        this.price = price;
        this.barCode = barCode;
        this.name = name;
        this.available = available;
        this.dueDate = dueDate;
        this.expeditionDate = expeditionDate;
    }

    public Product() {
    }
}
