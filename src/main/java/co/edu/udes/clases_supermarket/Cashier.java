/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes.clases_supermarket;

/**
 *
 * @author LabSispc14
 */
public class Cashier {
    
    private Employ employ;
    private String cashierNumber;
    private double moneyAvailable;

    @Override
    public String toString() {
        return "Cashier{" + "employ=" + employ + ", cashierNumber=" + cashierNumber + ", moneyAvailable=" + moneyAvailable + '}';
    }

    public Employ getEmploy() {
        return employ;
    }

    public void setEmploy(Employ employ) {
        this.employ = employ;
    }

    public String getCashierNumber() {
        return cashierNumber;
    }

    public void setCashierNumber(String cashierNumber) {
        this.cashierNumber = cashierNumber;
    }

    public double getMoneyAvailable() {
        return moneyAvailable;
    }

    public void setMoneyAvailable(double moneyAvailable) {
        this.moneyAvailable = moneyAvailable;
    }

    public Cashier(Employ employ, String cashierNumber, double moneyAvailable) {
        this.employ = employ;
        this.cashierNumber = cashierNumber;
        this.moneyAvailable = moneyAvailable;
    }
    
    public Cashier() {
    }
}
