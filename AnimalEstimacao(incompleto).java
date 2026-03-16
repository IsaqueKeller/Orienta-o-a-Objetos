package com.mycompany.exerciciooo;

public class AnimalEstimacao {
    private String species;
    private String race;
    private int age;
    private double weight;
    
    public AnimalEstimacao() {
        species = "";
        race = "";
        age = 0;
        weight = 0.0;
    }
    
    
    public AnimalEstimacao (AnimalEstimacao other) {
        this.species = other.getSpecies();
        this.race = other.getRace();
        this.age = other.getAge();
        this.weight = other.getWeight();
    }
    
    public AnimalEstimacao (String species, String race, int age, double weight) {
        this.species = species;
        this.race = race;
        this.age = age;
        this.weight = weight;
    }
    
    public String getSpecies () {
        return this.species;
    }
    
    public void setSpecies (String species) {
        this.species = species;
    }
    
    public String getRace () {
        return this.race;
    }
    
    public void setRace(String race) {
        this.race = race;
    }
    
    public int getAge () {
        return this.age;
    }
    
    public void setAge (int age) {
        this.age = age;
    }
    
    public double getWeight () {
        return this.weight;
    }
    
    public void setWeight (double weight) {
        this.weight = weight;
    }
}
