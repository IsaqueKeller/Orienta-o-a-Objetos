package com.mycompany.exerciciooo;

import java.util.Scanner;

public class Casa {
    private String adress;
    private double area;
    private int rooms;
    private double price;
    
    public Casa () {
        adress = "";
        area = 0.0;
        rooms = 0;
        price = 0;
    }
    
    public Casa (Casa other) {
        this.adress = other.getAdress();
        this.area = other.getArea();
        this.rooms = other.getRooms();
        this.price = other.getPrice();
    }
    
    public void copy (Casa other) {
        this.adress = other.getAdress();
        this.area = other.getArea();
        this.rooms = other.getRooms();
        this.price = other.getPrice();
    }
   
    public void fill () {
        Scanner reader = new Scanner (System.in);
        System.out.println("Adress: ");
        this.adress = reader.next();
        
        System.out.println("Area: ");
        this.area = reader.nextDouble();
        
        System.out.println("Rooms: ");
        this.rooms = reader.nextInt();
        
        System.out.println("Price: ");
        this.price = reader.nextDouble();
    }
    
    public void printInfo () {
        System.out.println("Adress: " + this.adress);
        System.out.println("Area: " + this.area);
        System.out.println("Rooms: " + this.rooms);
        System.out.println("Price: " + this.price);
    }
    
    public double calcularPrecoPorM2(double price , double area) {
        return this.price/this.area;
    }
    
    public void exibirResumo (Casa c1) {
        printInfo();
    }
    
    //getters and setters
    public String getAdress(){
        return adress;
    }
    
    public void setAdress (String adress) {
        adress = this.adress;
    }
    
    public double getArea () {
        return area;
    }
    
    public void setArea (double area) {
        area = this.area;
    }
    
    public int getRooms () {
        return rooms;
    }
    
    public void setRooms (int rooms) {
        rooms = this.rooms;
    }
    
    public double getPrice () {
        return price;
    }
    
    public void setPrice (double price){
        price = this.price;
    }
}
