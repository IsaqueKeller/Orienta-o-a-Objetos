package com.mycompany.exerciciooo;

import java.util.Scanner;

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
    
    public void copy (AnimalEstimacao other) {
        this.species = other.getSpecies();
        this.race = other.getRace();
        this.age = other.getAge();
        this.weight = other.getWeight();
    }
    
    public void fillInfo () {
        Scanner reader = new Scanner (System.in);
        System.out.println("What is the species? ");
        this.species = reader.next();
        
        System.out.println("What is the race? ");
        this.race = reader.next();
        
        System.out.println("What is the age? ");
        this.age = reader.nextInt();
        
        System.out.println("What is the weight? ");
        this.weight = reader.nextDouble();
    }
    
    public void printInfo () {
        System.out.println("");
        System.out.println("Species: " + this.species);
        System.out.println("Race: " + this.race);
        System.out.println("Age: " + this.age);
        System.out.println("Weight: " + this.weight);  
        int result = humanAge();
        System.out.println("Human age: " + result);
        makeSound();
    }
    
    public void makeSound () {
       if ("Cachorro".equals(species)) {
           System.out.println(race + " makes woof woof");
       
        }
       else if ("Gato".equals(species)) {
           System.out.println(race + " makes meow meow");
       }
       else {
           System.out.println(race + " makes a noise");
       }
    }
    
    public int humanAge () {
        return age*7;
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
