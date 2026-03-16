package com.mycompany.exerciooo
public class Main {

    public static void main(String[] args) {

        Ativo ativo1 = new Ativo("Apple Inc.", 121.99, 255, 1.87);
        Ativo ativo2 = new Ativo("Microsoft", 310.50, 120, -0.45);
        Ativo ativo3 = new Ativo("Tesla", 250.75, 80, 2.10);

        double totalCarteira = 0;

        ativo1.exibirResumo();
        ativo2.exibirResumo();
        ativo3.exibirResumo();

        totalCarteira += ativo1.calcularPosicaoDoAtivo();
        totalCarteira += ativo2.calcularPosicaoDoAtivo();
        totalCarteira += ativo3.calcularPosicaoDoAtivo();

        System.out.println("\nValor total da carteira: " + totalCarteira);
    }
}
