package com.mycompany.associacaogerenciadorsrp;

import java.util.Scanner;

public class AssociacaoGerenciadorSrp {

    public static void main(String[] args) {
        Scanner reader = new Scanner (System.in);
        int option;
        imprimeMenuAluno(reader, option);
   }
    
    public static void imprimeMenuAluno (Scanner reader , int option) {
        Aluno student = new Aluno();
        System.out.println("Filling student's information: ");
        System.out.println("Name: " );
        student.setName(reader.next());
        
        System.out.println("Enrollment Number: ");
        student.setEnrollmentNumber(reader.next());
        
        System.out.println("Email: ");
        student.setEmail(reader.next());
        
        System.out.println("Course: ");
        student.setCourse(reader.next());
        
        System.out.println("Phone number: ");
        
    }
    
    public static void imprimeMenuTelefone (Scanner reader , int option) {
        Telefone phoneNumber = new Telefone ();
        System.out.println("Filling phone number information: ");
        System.out.println("DDD: ");
        phoneNumber.setDDD(reader.next());
        
        System.out.println("");
    }
}
