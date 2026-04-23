package com.mycompany.exerciciooo;

import java.util.ArrayList;
import java.util.Scanner;

public class ExercicioOO {
  
    public static void main(String[] args) {
        Scanner reader = new Scanner (System.in);
        
        Carro c1 = fillInfoCar(reader);
        System.out.println(c1.toString());
        
        Carro c2 = fillInfoCar(reader);
        System.out.println(c2.toString());
        
        Carro c3 = fillInfoCar(reader);
        System.out.println(c3.toString());
    }
    
    public static Carro fillInfoCar(Scanner reader) {
        Carro myNewCar = new Carro ();
        ArrayList<Roda> listaDeRodas = new ArrayList<>();
        
        System.out.println("Carro: ");
        System.out.println("Model: ");
        String model = reader.next();
        myNewCar.setModel(model);
        
        System.out.println("Fabricator: ");
        String fabricator = reader.next();
        myNewCar.setFabricator(fabricator);
        
        System.out.println("Year: ");
        int year = reader.nextInt();
        myNewCar.setYear(year);
        
        System.out.println("Color: ");
        String color = reader.next();
        myNewCar.setColor(color);
        
        System.out.println("Wheels: ");
        Roda wheel = new Roda();
        wheel = fillInfoWheel(wheel , reader);
        //add 4 wheels
        listaDeRodas.add(wheel);
        listaDeRodas.add(wheel);
        listaDeRodas.add(wheel);
        listaDeRodas.add(wheel);
        myNewCar.setRoda(listaDeRodas);
        
        return myNewCar;
    }  
    
    public static Roda fillInfoWheel(Roda wheel , Scanner reader) {
        System.out.println("Radius: ");
        double radius = reader.nextDouble();
        wheel.setRadius(radius);
        
        System.out.println("Material: ");
        String material = reader.next();
        wheel.setMaterial(material);
        
        System.out.println("Color: ");
        String color = reader.next();
        wheel.setColor(color);
        
        return wheel;
    }
}
