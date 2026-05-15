
package com.mycompany.swinggui;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorPessoa {
    private List <Pessoa> listOfPeople;
    
    public GerenciadorPessoa () {
        listOfPeople = new ArrayList<>();
    }
    
    public void addPeople (Pessoa pessoa) {
        listOfPeople.add(pessoa);
        System.out.println("Insertion was a sucess");
    }
    
    public void removePeople (String name) {
        for (Pessoa person1 : listOfPeople) {
            if (person1.getName().equals(name)) {
                listOfPeople.remove(person1);
                System.out.println("Remotion was a sucess");
                return;
            }
        }
        System.out.println("Person not found");
    }

    
    
    @Override
    public String toString() {
        return listOfPeople;
    }
    
    public Pessoa searchPersonByCpf (String cpfSearching) {
        for (Pessoa person1 : listOfPeople) {
            if (person1.getCpf().equals(cpfSearching)) {
                return person1;
            }
        }
        return null;
    }
    
    public Pessoa searchPersonByName (String nameSearching) {
        for (Pessoa person1 : listOfPeople) {
            if (person1.getName().equals(nameSearching)) {
                return person1;
            }
        }
        return null;
    }
    
}
