package com.mycompany.associacaogerenciadorsrp;

public class Telefone {
    private String DDD;
    private String number;
    private String description; 
    private String operator;
    
    public Telefone () {
        DDD = "";
        number = "";
        description = "";
        operator = "";
    }

    public Telefone(String DDD, String number, String description, String operator) {
        this.DDD = DDD;
        this.number = number;
        this.description = description;
        this.operator = operator;
    }

    @Override
    public String toString() {
        return "Telefone{" + "DDD=" + DDD + ", number=" + number + ", description=" + description + ", operator=" + operator + '}';
    }

    public void copy (Telefone other) {
        this.DDD = other.DDD;
        this.number = other.number;
        this.description = other.description;
        this.operator = other.operator;
    }
    
    public String getDDD() {
        return DDD;
    }

    public void setDDD(String DDD) {
        this.DDD = DDD;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
    
    
}
