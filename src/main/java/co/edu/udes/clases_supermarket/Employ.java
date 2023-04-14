/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes.clases_supermarket;

/**
 *
 * @author LabSispc14
 */
public class Employ {
    
    private String name;
    private String dni;
    private String phoneNumber;
    private String schedule;
    private double salary;

    @Override
    public String toString() {
        return "Employ{" + "name=" + name + ", dni=" + dni + ", phoneNumber=" + phoneNumber + ", salary=" + salary + ", schedule=" + schedule + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String hourOfStartAndFinishOfWork) {
        this.schedule = schedule;
    }

    public Employ(String name, String dni, String phoneNumber, double salary, String schedule) {
        this.name = name;
        this.dni = dni;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.schedule = schedule;
    }

    public Employ() {
    }
}
