/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes.clases_supermarket;

/**
 *
 * @author LabSispc14
 */
public class Supplier {
    
    private String name;
    private String dni;

    @Override
    public String toString() {
        return "Supplier{" + "name=" + name + ", dni=" + dni + '}';
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

    public Supplier(String name, String dni) {
        this.name = name;
        this.dni = dni;
    }
    
    public Supplier() {
    }
}
