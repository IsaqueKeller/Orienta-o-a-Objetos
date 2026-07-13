package com.mycompany.projetoescola.Controller;
import com.mycompany.projetoescola.Model.entities.Professor;
import com.mycompany.projetoescola.Model.dao.IDAOAluno;

public class professorController {
    private IDAOAluno repositorio;
    
    public professorController (IDAOAluno repositorio) {
        this.repositorio = repositorio;
    }
    
    public void addProfessor (Professor professor) {
        
    }
    
    public boolean removeProfessor (String cpf) {
        
    }
    
    public Professor buscarProfessor (String cpf) {
        
    }
    
}
