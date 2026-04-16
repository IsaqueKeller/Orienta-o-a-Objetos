package com.mycompany.exerciciooo;
import java.util.List;
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
    
    public Carro (String model , int year , String color , String fabricator) {
        this.model = model;
        this.year = year;
        this.color = color;
        this.fabricator = fabricator;
        WheelsList = new ArrayList<>();
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
}
