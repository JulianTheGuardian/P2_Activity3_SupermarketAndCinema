/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes.clases_supermarket;

import java.util.Arrays;
import java.util.Date;

/**
 *
 * @author LabSispc14
 */
public class Bill {
    
    private Product[] product;
    private int[] numberOfProduct;
    private Employ employ;
    private Client client;
    private String expeditionDate;
    private String numberFacture;
    private String paymentMethod;
    private double totalPrice;
    private double moneyReceived;
    private double moneyExchange;

    @Override
    public String toString() {
        return "Bill{" + "product=" + Arrays.toString(product) + ", numberOfProduct=" + Arrays.toString(numberOfProduct) + ", employ=" + employ + ", client=" + client + ", expeditionDate=" + expeditionDate + ", numberFacture=" + numberFacture + ", paymentMethod=" + paymentMethod + ", totalPrice=" + totalPrice + ", moneyReceived=" + moneyReceived + ", moneyExchange=" + moneyExchange + '}';
    }

    public Product[] getProduct() {
        return product;
    }

    public void setProduct(Product[] product) {
        this.product = product;
    }

    public int[] getNumberOfProduct() {
        return numberOfProduct;
    }

    public void setNumberOfProduct(int[] numberOfProduct) {
        this.numberOfProduct = numberOfProduct;
    }

    public Employ getEmploy() {
        return employ;
    }

    public void setEmploy(Employ employ) {
        this.employ = employ;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getExpeditionDate() {
        return expeditionDate;
    }

    public void setExpeditionDate(String expeditionDate) {
        this.expeditionDate = expeditionDate;
    }

    public String getNumberFacture() {
        return numberFacture;
    }

    public void setNumberFacture(String numberFacture) {
        this.numberFacture = numberFacture;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double getMoneyReceived() {
        return moneyReceived;
    }

    public void setMoneyReceived(double moneyReceived) {
        this.moneyReceived = moneyReceived;
    }

    public double getMoneyExchange() {
        return moneyExchange;
    }

    public void setMoneyExchange(double moneyExchange) {
        this.moneyExchange = moneyExchange;
    }

    public Bill(Product[] product, int[] numberOfProduct, Employ employ, Client client, String expeditionDate, String numberFacture, String paymentMethod, double totalPrice, double moneyReceived, double moneyExchange) {
        this.product = product;
        this.numberOfProduct = numberOfProduct;
        this.employ = employ;
        this.client = client;
        this.expeditionDate = expeditionDate;
        this.numberFacture = numberFacture;
        this.paymentMethod = paymentMethod;
        this.totalPrice = totalPrice;
        this.moneyReceived = moneyReceived;
        this.moneyExchange = moneyExchange;
    }

    public Bill() {
    }
}
