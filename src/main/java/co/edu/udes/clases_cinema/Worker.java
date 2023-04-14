/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package co.edu.udes.clases_cinema;

import java.util.Date;

/**
 *
 * @author LabSispc14
 */
public class Worker {
    
    private String name;
    private String id;
    private String celphoneNumber;
    private String schedule;
    private double salary;

    public Worker() {
    }

    public Worker(String name, String id, String celphoneNumber, String schedule, double salary) {
        this.name = name;
        this.id = id;
        this.celphoneNumber = celphoneNumber;
        this.schedule = schedule;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getCelphoneNumber() {
        return celphoneNumber;
    }

    public String getSchedule() {
        return schedule;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCelphoneNumber(String celphoneNumber) {
        this.celphoneNumber = celphoneNumber;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Worker{" + "name=" + name + ", id=" + id + ", celphoneNumber=" + celphoneNumber + ", schedule=" + schedule + ", salary=" + salary + '}';
    }
    
}
