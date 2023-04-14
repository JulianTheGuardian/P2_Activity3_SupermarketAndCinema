/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes.clases_supermarket;

import java.util.Arrays;

/**
 *
 * @author LabSispc14
 */
public class Storage {
    
    private Product[] product;
    private int[] cuantityOfProduct;
    private Employ employ;

    @Override
    public String toString() {
        return "Storage{" + "product=" + Arrays.toString(product) + ", cuantityOfProduct=" + Arrays.toString(cuantityOfProduct) + ", employ=" + employ + '}';
    }

    public Product[] getProduct() {
        return product;
    }

    public void setProduct(Product[] product) {
        this.product = product;
    }

    public int[] getCuantityOfProduct() {
        return cuantityOfProduct;
    }

    public void setCuantityOfProduct(int[] cuantityOfProduct) {
        this.cuantityOfProduct = cuantityOfProduct;
    }

    public Employ getEmploy() {
        return employ;
    }

    public void setEmploy(Employ employ) {
        this.employ = employ;
    }

    public Storage(Product[] product, int[] cuantityOfProduct, Employ employ) {
        this.product = product;
        this.cuantityOfProduct = cuantityOfProduct;
        this.employ = employ;
    }

    public Storage() {
    }
}
