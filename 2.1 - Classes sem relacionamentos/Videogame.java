package com.mycompany.exerciciooo;

public class Videogame {
    private String title;
    private String plataform;
    private String ageRating;
    private float price;
    
    public Videogame () {
        title = "";
        plataform = "";
        ageRating = "";
        price = 0.0;
    }
    
    public Videogame (String title , String plataform , String ageRating , float price) {
        this.title = title;
        this.plataform = plataform;
        this.ageRating = ageRating;
        this.price = price;
    }
    
    @Override
    public String toString () {
        return "Videogame: " + " Title: " + title + " Plataform: " + plataform + " Age Rating: " + ageRating + " Price: " + price; 
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPlataform() {
        return plataform;
    }

    public void setPlataform(String plataform) {
        this.plataform = plataform;
    }

    public String getAgeRating() {
        return ageRating;
    }

    public void setAgeRating(String ageRating) {
        this.ageRating = ageRating;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    } 
}
