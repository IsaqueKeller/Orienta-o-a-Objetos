package com.mycompany.listamusicas;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Listamusicas {

    public static int imprimeMenu () {
        
        Scanner reader = new reader(System.in);
        
        System.out.println("Escolha uma opcao: ");
        System.out.println("1 - Adicionar um livro: ");
        System.out.println("2 - Remover um livro: ");
        System.out.println("3 - Pesquisar um livro (titulo): ");
        System.out.println("4 - Pesquisar um livro (autor): ");
        System.out.println("0 - Sair");
        System.out.println("Escolha uma opcao: ");
        return option = reader.nextInt();
    }
    public static void main(String[] args) {
         int option = 0;
         Scanner reader = new reader(System.in);
        List <Musica> listaMusicas;
        listaMusicas = new ArrayList();
        do {
            option = imprimeMenu();
            if (option == 1) {
                Musica m1 = new Musica ();
                m1.preencher();
                listaMusicas.add(m1);
            }
            else if (option == 2) {
                System.out.println("digite o titulo ");
                String title = reader.nextLine();
                for (int i = 0; i < listaMusicas.size() - 1; i++) {
                    Musica mi = listaMusicas.get(i);
                    if (titulo.equals(li.getTitulo())) {
                        System.out.println("Musica encontrada");
                        listaMusicas.remove(i);
                    }
                }
            }
            else if (option == 3) {
                System.out.println("Informe o titulo: ");
                String title = reader.nextLine();
                
                for (int i = 0; i <= listaMusicas.size() - 1; i++) {
                    Musica mi = listaMusicas.get(i);
                    if (titulo.equals(mi.getTitulo())) {
                        System.out.println("Musica encontrada");
                        mi.imprimir();
                    }
                }
            }
        } while (option != 0);
        
      
    }
}
