package com.mycompany.exerciciooo;

import java.util.HashMap;
import java.util.Map;

public class ExercicioOO {
    public static void main(String[] args) {
        HashMap<String , Double> produtos = new HashMap <>();
        produtos.put("Arroz" , 15.00);
        produtos.put("Feijao" , 20.00);
        produtos.put("Leite" , 6.00);
        produtos.put("Ovo" , 12.00);
        
        produtos.put("Arroz", 13.00);
        
         for (Map.Entry<String,Double>informacoes : produtos.entrySet()){
             System.out.println("Nome: " + informacoes.getKey() + 
             ", Preco: " + informacoes.getValue());
         }
        
        if (produtos.containsKey("Arroz")) {
            produtos.remove("Arroz");
        }
       
        System.out.println("Atualizacao: ");
        for (Map.Entry<String,Double>informacoes : produtos.entrySet()){
             System.out.println("Nome: " + informacoes.getKey() + 
             ", Preco: " + informacoes.getValue());
         }
    }
}
