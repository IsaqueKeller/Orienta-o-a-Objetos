package com.mycompany.projetoescola.Model;

import com.mycompany.projetoescola.Model.Disciplina;

public class Professor extends Pessoa {    
    private Disciplina disciplinaMinistrada;
    private boolean mestrado;
    private boolean doutorado;

    public Professor(Disciplina disciplinaMinistrada, boolean mestrado, boolean doutorado) {
        this.disciplinaMinistrada = disciplinaMinistrada;
        this.mestrado = mestrado;
        this.doutorado = doutorado;
    }

    
}

