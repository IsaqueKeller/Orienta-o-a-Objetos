package com.mycompany.classesemrelacionamento;

import java.util.Scanner;

public class Livro {
    private String title;
    private String author;
    private int numberOfPages;
    private double price;
    
    public Livro () {
        title = "";
        author = "";
        numberOfPages = 0;
        price = 0.0;
    }
    
    public Livro (String title , String author , int numberOfPages , double price) {
        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.price = price;
    }
    
    public Livro (Livro other) {
        this.title = other.title;
        this.author = other.author;
        this.numberOfPages = other.numberOfPages;
        this.price = other.price;
    }

    public void copy (Livro other) {
        this.title = other.title;
        this.author = other.author;
        this.numberOfPages = other.numberOfPages;
        this.price = other.price;
    }
    
    public void fillInfo () {
        Scanner reader = new Scanner (System.in);
        System.out.println("Fill the book information: ");
        System.out.println("Title: ");
        this.title = reader.next();
        
        System.out.println("Author: ");
        this.author = reader.next();
        
        System.out.println("Number of pages: ");
        this.numberOfPages = reader.nextInt();
        
        System.out.println("Price: ");
        this.price = reader.nextDouble();
    }
    
    public void printInfo () {
        System.out.println("Book information: ");
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Number of pages: " + this.numberOfPages);
        System.out.println("Price: " + this.price);
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    
}
