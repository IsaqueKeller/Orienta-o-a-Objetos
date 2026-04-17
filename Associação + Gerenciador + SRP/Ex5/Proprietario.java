package com.mycompany.exerciciooo;

import java.util.ArrayList;
import java.util.List;

class Proprietario {
    private String name;
    private String cpf;
    private String email;
    private List <Carro> listOfCars;
    
    public Proprietario () {
        name = "";
        cpf = "";
        email = "";
        listOfCars = new ArrayList <>();
    }
    
   

    @Override
    public String toString() {
        return "Proprietario{" + "name=" + name + ", cpf=" + cpf + ", email=" + email + ", listOfCars=" + listOfCars + '}';
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

    public List<Carro> getListOfCars() {
        return listOfCars;
    }

    public void setListOfCars(List<Carro> listOfCars) {
        this.listOfCars = listOfCars;
    }
    
    
}
