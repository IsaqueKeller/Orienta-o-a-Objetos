package com.mycompany.exerciciooo;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Carro {
    private String model;
    private String fabricator;
    private int year;
    private String color;
    private List<Roda> WheelsList;
    
    public Carro() {
        this.model = "";
        this.year = 0;
        this.color = "";
        this.fabricator = "";
        WheelsList = new ArrayList <>();
    }
    
    public static void contadorDeCarros() {
        System.out.println("This is a static method");
    }
    
    public Carro (String model , String fabricator , int year , String color) {
        this.model = model;
        this.year = year;
        this.color = color;
        this.fabricator = fabricator;
        WheelsList = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Carro{" + "model = " + model + ", fabricator = " + fabricator + ", year = " + year + ", color = " + color + ", WheelsList = " + WheelsList + '}';
    }
    
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public String getFabricator () {
        return fabricator;
    }
    
    public void setFabricator (String fabricator) {
        this.fabricator = fabricator;
    }
    
    public List<Roda> getRoda () {
        return WheelsList;
    }
    
    public void setRoda (List<Roda> WheelsList) {
        this.WheelsList = WheelsList;
    }
}
