package com.mycompany.projetoescola.Model.entities;
public class Aluno extends Pessoa {  
    private String matricula;
    private int serie;

    public Aluno(String matricula, int serie) {
        this.matricula = matricula;
        this.serie = serie;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    
    
    
}
