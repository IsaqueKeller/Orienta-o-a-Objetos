package com.mycompany.projetoescola.Model.entities;

import com.mycompany.projetoescola.Model.entities.Disciplina;

public class Professor extends Pessoa {    
    private Disciplina disciplinaMinistrada;
    private boolean mestrado;
    private boolean doutorado;

    public Professor(Disciplina disciplinaMinistrada, boolean mestrado, boolean doutorado) {
        this.disciplinaMinistrada = disciplinaMinistrada;
        this.mestrado = mestrado;
        this.doutorado = doutorado;
    }

    public Disciplina getDisciplinaMinistrada() {
        return disciplinaMinistrada;
    }

    public void setDisciplinaMinistrada(Disciplina disciplinaMinistrada) {
        this.disciplinaMinistrada = disciplinaMinistrada;
    }

    public boolean isMestrado() {
        return mestrado;
    }

    public void setMestrado(boolean mestrado) {
        this.mestrado = mestrado;
    }

    public boolean isDoutorado() {
        return doutorado;
    }

    public void setDoutorado(boolean doutorado) {
        this.doutorado = doutorado;
    }

    
}

