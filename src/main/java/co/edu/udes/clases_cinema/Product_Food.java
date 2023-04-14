/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes.clases_cinema;

/**
 *
 * @author LabSispc14
 */
public class Product_Food {
    
    private String id;
    private String name;
    private String typeOfProduct;
    private double foodPrice;

    public Product_Food() {
    }

    @Override
    public String toString() {
        return "Product_Food{" + "id=" + id + ", name=" + name + ", typeOfProduct=" + typeOfProduct + ", foodPrice=" + foodPrice + '}';
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTypeOfProduct(String typeOfProduct) {
        this.typeOfProduct = typeOfProduct;
    }

    public void setFoodPrice(double foodPrice) {
        this.foodPrice = foodPrice;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTypeOfProduct() {
        return typeOfProduct;
    }

    public double getFoodPrice() {
        return foodPrice;
    }

    public Product_Food(String id, String name, String typeOfProduct, double foodPrice) {
        this.id = id;
        this.name = name;
        this.typeOfProduct = typeOfProduct;
        this.foodPrice = foodPrice;
    }
    
}
