package com.mycompany.projetoescola.Model.entities;
public class Disciplina {
    private String name;
    private String codigoDisciplina;
    private int horasMinistradas;
    
    public Disciplina () {
        name = "";
        codigoDisciplina = "";
        horasMinistradas = 0;
    }
    
    public Disciplina (String name , String codigoDisciplina , int horasMinistradas) {
        this.name = name;
        this.codigoDisciplina = codigoDisciplina;
        this.horasMinistradas = horasMinistradas;
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getCodigoDisciplina() {
        return codigoDisciplina;
    }

    public void setCodigoDisciplina(String codigoDisciplina) {
        this.codigoDisciplina = codigoDisciplina;
    }

    public int getHorasMinistradas() {
        return horasMinistradas;
    }

    public void setHorasMinistradas(int horasMinistradas) {
        this.horasMinistradas = horasMinistradas;
    }
    
    
}
