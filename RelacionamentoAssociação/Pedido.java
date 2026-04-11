package com.mycompany.relacionamentosassociacao;

public class Pedido {
    private int number;
    private String date;
    private int quantity;
    private Produto produto;
    
    public Pedido () {
        number = 0;
        date = "";
        quantity = 0;
        produto = 0;
    }
    
    
    
    public Pedido (int number , String date , int quantity , Produto produto) {
        this.number = number;
        this.date = date;
        this.quantity = quantity;
        this.produto = produto;
    }
    
    public void calcularTotal(int quantity) {
        float total = produto.getPrice() * this.quantity;
        System.out.println("Total price is: " + total);
    }

    @Override
    public String toString() {
        return "Pedido{" + "number=" + number + ", date=" + date + ", quantity=" + quantity + ", produto=" + produto + '}';
    }
    
    public int getNumber() {
        return number;
    }

    public String getDate() {
        return date;
    }

    public int getQuantity() {
        return quantity;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}
