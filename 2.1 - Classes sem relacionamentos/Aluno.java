package com.mycompany.classesemrelacionamento;

import java.util.Scanner;

public class Aluno {
    private String name;
    private int age;
    private String registration;
    private int yearOfAdmission;
    
    public Aluno () {
        this.name = "";
        this.age = 0;
        this.registration = "";
        this.yearOfAdmission = 0;
    }
    
    public Aluno (String name , int age , String registration , int yearOfAdmission) {
        this.name = name;
        this.age = age;
        this.registration = registration;
        this.yearOfAdmission = yearOfAdmission;
    }
    
    public Aluno (Aluno other) {
        this.name = other.name;
        this.age = other.age;
        this.registration = other.registration;
        this.yearOfAdmission = other.yearOfAdmission;
    }
    
    public void copy (Aluno other) {
        this.name = other.name;
        this.age = other.age;
        this.registration = other.registration;
        this.yearOfAdmission = other.yearOfAdmission;
    }
    
    public void fillInfo () {
        Scanner reader = new Scanner (System.in);
        System.out.println("Fill the student's info: ");
        System.out.println("Name: ");
        this.name = reader.next();
        
        System.out.println("Age: ");
        this.age = reader.nextInt();
        
        System.out.println("Registration: ");
        this.registration = reader.next();
        
        System.out.println("Year of admission: ");
        this.yearOfAdmission = reader.nextInt();
    }
    
    public void printInfo () {
        System.out.println("Student's info: ");
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Registration: " + this.registration);
        System.out.println("Year of admission: " + this.yearOfAdmission);
        
    }
    
    public String getName () {
        return name;
    }
    
    public void setName (String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public int getYearOfAdmission() {
        return yearOfAdmission;
    }

    public void setYearOfAdmission(int yearOfAdmission) {
        this.yearOfAdmission = yearOfAdmission;
    }
    
    
}
