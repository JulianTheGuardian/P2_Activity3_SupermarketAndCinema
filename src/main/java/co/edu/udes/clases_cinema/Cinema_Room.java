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
public class Cinema_Room {
    
    private String id;
    private String type;
    private int numberOfCommonChairs;
    private int numberOfPremiumChairs;
    private int totalOfChairs;
    private Chair[] chair;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumberOfCommonChairs() {
        return numberOfCommonChairs;
    }

    public void setNumberOfCommonChairs(int numberOfCommonChairs) {
        this.numberOfCommonChairs = numberOfCommonChairs;
    }

    public int getNumberOfPremiumChairs() {
        return numberOfPremiumChairs;
    }

    public void setNumberOfPremiumChairs(int numberOfPremiumChairs) {
        this.numberOfPremiumChairs = numberOfPremiumChairs;
    }

    public int getTotalOfChairs() {
        return totalOfChairs;
    }

    public void setTotalOfChairs(int totalOfChairs) {
        this.totalOfChairs = totalOfChairs;
    }

    public Chair[] getChair() {
        return chair;
    }

    public void setChair(Chair[] chair) {
        this.chair = chair;
    }

    @Override
    public String toString() {
        return "Cinema_Room{" + "id=" + id + ", type=" + type + ", numberOfCommonChairs=" + numberOfCommonChairs + ", numberOfPremiumChairs=" + numberOfPremiumChairs + ", totalOfChairs=" + totalOfChairs + ", chair=" + Arrays.toString(chair) + '}';
    }

    public Cinema_Room() {
    }

    public Cinema_Room(String id, String type, int numberOfCommonChairs, int numberOfPremiumChairs, int totalOfChairs, Chair[] chair) {
        this.id = id;
        this.type = type;
        this.numberOfCommonChairs = numberOfCommonChairs;
        this.numberOfPremiumChairs = numberOfPremiumChairs;
        this.totalOfChairs = totalOfChairs;
        this.chair = chair;
    }
    
}
