package com.mycompany.exerciciooo;

import java.util.Scanner;

public class Tv {
private String brand;
private double size;
private String resolution;
private double price;

//methods 
public Tv () {
    brand = "";
    size = 0.0;
    resolution = "";
    price = 0.0;
    
}

public Tv (String brand , double size , String resolution , double price) {
    this.brand = brand;
    this.size = size;
    this.resolution = resolution;
    this.price = price;
}

public void copy (Tv other) {
    this.brand = other.getBrand();
    this.size = other.getSize();
    this.resolution = other.getResolution();
    this.price = other.getPrice();
}

public void fill () {
    Scanner reader = new Scanner (System.in);
    System.out.println("Fill the informations: ");
    
    System.out.println("Brand: ");
    this.brand = reader.next();
    
    System.out.println("Size: ");
    this.size = reader.nextDouble();
    
    System.out.println("Resolution: ");
    this.resolution = reader.next();
    
    System.out.println("Price: ");
    this.price = reader.nextDouble();
}

public void print () {
    System.out.println("Brand: " + this.brand);
    System.out.println("Size: " + this.size);
    System.out.println("Resolution: " + this.resolution);
    System.out.println("Price: " + this.price);
}

//getters and setters
public String getBrand () {
    return brand;
}

public void setBrand (String brand) {
    this.brand = brand;
}

public double getSize () {
    return size;
}

public void setSize (double size) {
    this.size = size;
}

public String getResolution () {
    return resolution;
}

public void setResolution (String resolution) {
    this.resolution = resolution;
}

public double getPrice () {
    return price;
}

public void setPrice (double price) {
    this.price = price;
}

}
