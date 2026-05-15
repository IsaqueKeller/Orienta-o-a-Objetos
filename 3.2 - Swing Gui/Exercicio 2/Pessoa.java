package com.mycompany.swinggui;

public class Pessoa {
    private String name;
    private String cpf;
    private int age;
    
    public Pessoa () {
        name = "";
        cpf = "";
        age = 0;
    }
    
    public Pessoa (String name , String cpf , int age) {
        this.name = name;
        this.cpf = cpf;
        this.age = age;
    }

    @Override
    public String toString() {
        return "name = " + name + ", cpf = " + cpf + ", age = " + age + '\n';
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    
}
