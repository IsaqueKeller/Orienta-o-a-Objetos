package com.mycompany.exerciciooo;
import java.util.Scanner;

public class Celular {
//atributos
    private String marca;
    private String modelo;
    private double preco;
    private int ano;
    
    //metodos
    //construtor
    public Celular () {
        this.marca = "";
        this.modelo = "";
        this.preco = 0.0;
        this.ano = 0;
    }
    //copiar
    public void copiar (Celular other) {
        this.marca = other.getMarca();
        this.modelo = other.getModelo();
        this.preco = other.getPreco();
        this.ano = other.getAno();
    }
    //preencher
    public void preencher() { //incompleto
        Scanner leitor = new Scanner (System.in);
        System.out.println("Preenchendo celular");
        
        System.out.println("Marca: ");
        this.marca = leitor.next();
        
        System.out.println("Modelo: ");
        this.modelo = leitor.next();
        
        System.out.println("Preco: ");
        this.preco = leitor.nextDouble();
        
        System.out.println("Ano: ");
        this.ano = leitor.nextInt();
        
        
    }
    
    //getters e setters
    public String getMarca () {
        return marca;
    }
    
    public void setMarca (String marca) {
        this.marca = marca;
    }
    
    public String getModelo () {
        return modelo;
    }
    
    public void setModelo (String modelo) {
        this.modelo = modelo;
    }
    
    public double getPreco () {
        return preco;   
    }
    
    public void setPreco (double preco) {
        this.preco = preco;
    }
    
    public int getAno () {
        return ano;
    }
    
    public void setAno (int ano) {
        this.ano = ano;
    }
}
