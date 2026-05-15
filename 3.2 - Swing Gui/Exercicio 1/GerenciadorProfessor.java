package com.mycompany.swinggui;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorProfessor {
    private List<Professor> listOfTeachers;
    
    public GerenciadorProfessor () {
        listOfTeachers = new ArrayList<>();
    }
    
    public void addTeacher (Professor professor) {
        listOfTeachers.add(professor);
    }
    
    public void removeTeacher (String name) {
        for (Professor professor : listOfTeachers) {
            if (professor.getName().equals(name))   
            listOfTeachers.remove(professor);
        }
        return null;
    }
    
    public Professor searchTeacherByName (String name) {
        for (Professor professor : listOfTeachers) {
            if (professor.getName().equals(name)) {
                return professor;
        }
    }
        return null;
}
}
