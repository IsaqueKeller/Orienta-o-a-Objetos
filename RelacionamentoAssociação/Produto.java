package com.mycompany.relacionamentosassociacao;

public class Produto {
    private String name;
    private String category;
    private double price;
    
    public Produto () {
        name = "";
        category = "";
        price = 0.0;
    }

    public Produto(String name, String category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Produto{" + "name=" + name + ", category=" + category + ", price=" + price + '}';
    }
    
    
    
}
