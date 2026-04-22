package com.mycompany.exerciciooo;

public class Roda {
    private double radius;
    private String material;
    private String color;
    
    public Roda () {
        radius = 0.0;
        material = "";
        color = "";
    }
    
    public Roda (double radius , String material , String color) {
        this.radius = radius;
        this.material = material;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
}
