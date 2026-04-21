package com.mycompany.movie;
import java.util.Scanner;

public class Movie {

    private String title;
    private String director;
    
    public Movie(){
        this.title = "";
        this.director = "";
        
    }
    public Movie(String title, String director){
        this.title = title;
        this.director = director;
    }
    
    @Override
    public String toString(){
        return "Title: " + this.title + " | Director: " + this.director;
    }
    
    public void Imprimir(){
        System.out.println(this.toString());
    }
    
    Scanner scan = new Scanner(System.in);
    
    public void Copiar(Movie outro){
        this.setTitle(outro.getTitle());
        this.setDirector(outro.getDirector());
        
    }
    public void Preencher(){
        System.out.println("=====Filme=====");
        System.out.println("Inform the title: ");
        this.setTitle(scan.nextLine());
        System.out.println("Inform the director: ");
        this.setDirector(scan.nextLine());
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
    
}
