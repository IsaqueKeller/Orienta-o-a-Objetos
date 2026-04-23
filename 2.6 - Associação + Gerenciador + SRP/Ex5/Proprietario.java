package com.mycompany.exerciciooo;

import java.util.ArrayList;
import java.util.List;

public class Proprietario {
    private String name;
    private String cpf;
    private String email;
    private List<Carro> CarsList;
    
    public Proprietario () {
        name = "";
        cpf = "";
        email = "";
        CarsList = new ArrayList<>();
    }
    
    public Proprietario (String name , String cpf , String email) {
        this.name = name;
        this.cpf = cpf;
        this.email = email;
        this.CarsList = CarsList;
    }

    @Override
    public String toString() {
        return "Proprietario{" + "name=" + name + ", cpf=" + cpf + ", email=" + email + ", CarsList=" + CarsList + '}';
    }    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List getCarsList() {
        return CarsList;
    }

    public void setCarsList(List CarsList) {
        this.CarsList = CarsList;
    }
    
    
}
