/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes.clases_cinema;

import java.util.Arrays;

/**
 *
 * @author LabSispc14
 */
public class Bill_Food {
    
    private String billId;
    private Product_Food[] productNames;
    private int[] numberOfProduc;
    private double totalPrice;
    private Client client;
    private Worker worker;

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }

    public Product_Food[] getProductNames() {
        return productNames;
    }

    public void setProductNames(Product_Food[] productNames) {
        this.productNames = productNames;
    }

    public int[] getNumberOfProduc() {
        return numberOfProduc;
    }

    public void setNumberOfProduc(int[] numberOfProduc) {
        this.numberOfProduc = numberOfProduc;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Worker getWorker() {
        return worker;
    }

    public void setWorker(Worker worker) {
        this.worker = worker;
    }

    public Bill_Food(String billId, Product_Food[] productNames, int[] numberOfProduc, double totalPrice, Client client, Worker worker) {
        this.billId = billId;
        this.productNames = productNames;
        this.numberOfProduc = numberOfProduc;
        this.totalPrice = totalPrice;
        this.client = client;
        this.worker = worker;
    }

    public Bill_Food() {
    }

    @Override
    public String toString() {
        return "Bill_Food{" + "billId=" + billId + ", productNames=" + Arrays.toString(productNames) + ", productId=" + Arrays.toString(numberOfProduc) + ", totalPrice=" + totalPrice + ", client=" + client + ", worker=" + worker + '}';
    }
}
