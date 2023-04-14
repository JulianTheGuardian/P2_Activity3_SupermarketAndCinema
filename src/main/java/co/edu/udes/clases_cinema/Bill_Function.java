/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes.clases_cinema;

/**
 *
 * @author LabSispc14
 */
public class Bill_Function {
    
    private String billId;
    private String chairId;
    private String cinemaRoomId;
    private double totalPrice;
    private Client client;
    private Worker worker;
    private Function function;

    @Override
    public String toString() {
        return "Bill_Function{" + "billId=" + billId + ", chairId=" + chairId + ", cinemaRoomId=" + cinemaRoomId + ", totalPrice=" + totalPrice + ", client=" + client + ", worker=" + worker + ", function=" + function + '}';
    }

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }

    public String getChairId() {
        return chairId;
    }

    public void setChairId(String chairId) {
        this.chairId = chairId;
    }

    public String getCinemaRoomId() {
        return cinemaRoomId;
    }

    public void setCinemaRoomId(String cinemaRoomId) {
        this.cinemaRoomId = cinemaRoomId;
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

    public Function getFunction() {
        return function;
    }

    public void setFunction(Function function) {
        this.function = function;
    }

    public Bill_Function(String billId, String chairId, String cinemaRoomId, int numberOfChairs, double totalPrice, Client client, Worker worker, Function function) {
        this.billId = billId;
        this.chairId = chairId;
        this.cinemaRoomId = cinemaRoomId;
        this.totalPrice = totalPrice;
        this.client = client;
        this.worker = worker;
        this.function = function;
    }

    public Bill_Function() {
    }
}
