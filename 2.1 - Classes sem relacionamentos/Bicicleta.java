package com.mycompany.exerciciooo;

import java.util.Scanner;

public class Bicycle {
    private String brand;
    private String model;
    private double size_of_frame;
    private double price;
    
    public Bicycle() {
        brand = "";
        model = "";
        size_of_frame = 0.0;
        price = 0.0;
    }
    
    public Bicycle (Bicycle other) {
        brand = other.getBrand();  
        model = other.getModel();
        size_of_frame = other.getSize();
        price = other.getPrice();
    }
    
    public void copy (Bicycle other) {
        brand = other.getBrand();  
        model = other.getModel();
        size_of_frame = other.getSize();
        price = other.getPrice();
    }
    
    public void fillInfo () {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Fill all informations: ");
        System.out.println("Brand: ");
        brand = reader.next();
        
        System.out.println("Model: ");
        model = reader.next();
        
        System.out.println("Size of frame: ");
        size_of_frame = reader.nextDouble();
        
        System.out.println("Price: ");
        price = reader.nextDouble();
    }
    
    public void printInfo () {
        System.out.println("Brand: "+ this.brand);
        System.out.println("Model: " + this.model);
        System.out.println("Size of Frame: " + this.size_of_frame);
        System.out.println("Price: " + this.price);
    }
    
    @Override
    public String toString () {
        return "Brand: " + this.brand + ", Model: " + this.model + ", Size of frame: " + this.size_of_frame + ", Price: " + this.price;
        
    }
    
    //getters and setters
    public String getBrand() {
        return brand;
    }
    
    public void setBrand(String brand) {
        brand = this.brand;
    }
    
    public String getModel() {
        return model;
    }
    
    public void setModel(String model) {
        model = this.model;
    }
    
    public double getSize () {
        return size_of_frame;
    }
    
    public void setSize (double size_of_frame) {
        size_of_frame = this.size_of_frame;
    }
    
    public double getPrice() {
        return price;
    }
    
    public void setPrice(double price) {
        price = this.price;
    }
}
