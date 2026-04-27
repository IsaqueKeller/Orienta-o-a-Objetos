package com.mycompany.associacaogerenciadorsrp;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String name;
    private String enrollmentNumber;
    private String email;
    private String course;
    private List <Telefone> listOfPhoneNumber;
    
    public Aluno () {
        name = "";
        enrollmentNumber = "";
        email = "";
        course = "";
        listOfPhoneNumber = new ArrayList<>();
    }

    public Aluno(String name, String enrollmentNumber, String email, String course, List<Telefone> listOfPhoneNumber) {
        this.name = name;
        this.enrollmentNumber = enrollmentNumber;
        this.email = email;
        this.course = course;
        this.listOfPhoneNumber = listOfPhoneNumber;
    }

    @Override
    public String toString() {
        return "Aluno{" + "name=" + name + ", enrollmentNumber=" + enrollmentNumber + ", email=" + email + ", course=" + course + ", listOfPhoneNumber=" + listOfPhoneNumber + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnrollmentNumber() {
        return enrollmentNumber;
    }

    public void setEnrollmentNumber(String enrollmentNumber) {
        this.enrollmentNumber = enrollmentNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public List<Telefone> getListOfPhoneNumber() {
        return listOfPhoneNumber;
    }

    public void setListOfPhoneNumber(List<Telefone> listOfPhoneNumber) {
        this.listOfPhoneNumber = listOfPhoneNumber;
    }
    
    
    
}
