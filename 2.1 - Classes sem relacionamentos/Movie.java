package com.mycompany.movie;

import java.util.Scanner;

public class Movie {

    private String title;
    private String artist;
    private double duration;
    private double price;

    Scanner scan = new Scanner(System.in);
    public Movie() {
        this.title = "";
        this.artist = "";
        this.duration = 0;
        this.price = 0;
    }
    public Movie(String title, String artist, double duration, double price) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
        this.price = price;
    }

   public void preencher() {
        System.out.println("===== Movie =====");

        System.out.print("Informe o título: ");
        this.title = scan.nextLine();

        System.out.print("Informe o artista: ");
        this.artist = scan.nextLine();

        System.out.print("Informe a duração: ");
        this.duration = scan.nextDouble();

        System.out.print("Informe o preço: ");
        this.price = scan.nextDouble();
    }

    public void imprimir() {
        System.out.println("Title: " + title);
        System.out.println("Artist: " + artist);
        System.out.println("Duration: " + duration);
        System.out.println("Price: " + price);
    }

    public void copiar(Movie outro) {
        this.title = outro.getTitle();
        this.artist = outro.getArtist();
        this.duration = outro.getDuration();
        this.price = outro.getPrice();
    }
  
    // Getters e Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
