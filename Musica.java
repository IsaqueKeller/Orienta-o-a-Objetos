package com.mycompany.ex8musica;

import java.util.Scanner;

public class Musica {
    private String titulo;
    private String artista;
    private Double duracao;
    private Double preco;
    
    public Musica() {
        this.titulo = "";
        this.artista = "";
        this.duracao = 0.0;
        this.preco = 0.0;
    }
    
    public Musica (Musica other) {
        this.titulo = other.getTitulo();
        this.artista = other.getArtista();
        this.duracao = other.getDuracao();
        this.preco = other.getPreco();
    }
    
    public void copiar (Musica other) {
        this.titulo = other.getTitulo();
        this.artista = other.getArtista();
        this.duracao = other.getDuracao();
        this.preco = other.getPreco();
    }
    
    public void preencher () {
        Scanner leitor = new Scanner (System.in);
        System.out.println("Informe os dados da Musica: ");
        
        System.out.println("Titulo: ");
        this.titulo = leitor.next();
        
        System.out.println("Artista: ");
        this.artista = leitor.next();
        
        System.out.println("Duracao: ");
        this.duracao = leitor.nextDouble();
        
        System.out.println("Preco: ");
        this.preco = leitor.nextDouble();
    }
    
    public void imprimir () {
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Artista: " + this.artista);
        System.out.println("Duracao: " + this.duracao);
        System.out.println("Preco: " + this.preco);
        
    }         
    
    public void tocarMusica () {
        System.out.println("Agora tocando: " + this.titulo + " - " + this.artista);
    }
    
    public void desligarMusica() {
        System.out.println("Desligando a musica");
    }
    //getters e setters
    public String getTitulo ( ){
        return titulo;
    }
    public void setTitulo (String titulo) {
        this.titulo = titulo;
    }
    public String getArtista () {
        return artista;
    }
    public void setArtista (String artista) {
        this.artista = artista;
    }
    public double getDuracao () {
        return duracao;
    }
    public setDuracao (double duracao) {
        this.duracao = duracao;
    }
    public double getPreco () {
        return preco;
    }
    public void setPreco(){
        this.preco = preco;
    }
    }

