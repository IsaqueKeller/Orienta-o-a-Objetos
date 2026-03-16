package com.mycompany.exerciciooo;
import java.util.Scanner;

class Ativo {

    private String nomeEmpresa;
    private double precoAcao;
    private double qtdAcoes;
    private double variacaoDiaria;

    // Construtor vazio
    public Ativo() {
    }

    // Construtor com todos os parâmetros
    public Ativo(String nomeEmpresa, double precoAcao, double qtdAcoes, double variacaoDiaria) {
        this.nomeEmpresa = nomeEmpresa;
        this.precoAcao = precoAcao;
        this.qtdAcoes = qtdAcoes;
        this.variacaoDiaria = variacaoDiaria;
    }

    // Getters e Setters
    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public double getPrecoAcao() {
        return precoAcao;
    }

    public void setPrecoAcao(double precoAcao) {
        this.precoAcao = precoAcao;
    }

    public double getQtdAcoes() {
        return qtdAcoes;
    }

    public void setQtdAcoes(double qtdAcoes) {
        this.qtdAcoes = qtdAcoes;
    }

    public double getVariacaoDiaria() {
        return variacaoDiaria;
    }

    public void setVariacaoDiaria(double variacaoDiaria) {
        this.variacaoDiaria = variacaoDiaria;
    }

    // Preencher dados
    public void preencher(Scanner sc) {
        System.out.print("Nome da empresa: ");
        nomeEmpresa = sc.nextLine();

        System.out.print("Preço da ação: ");
        precoAcao = sc.nextDouble();

        System.out.print("Quantidade de ações: ");
        qtdAcoes = sc.nextDouble();

        System.out.print("Variação diária (%): ");
        variacaoDiaria = sc.nextDouble();
        sc.nextLine();
    }

    // Imprimir dados
    public void imprimir() {
        System.out.println("Empresa: " + nomeEmpresa);
        System.out.println("Preço da ação: " + precoAcao);
        System.out.println("Quantidade de ações: " + qtdAcoes);
        System.out.println("Variação diária: " + variacaoDiaria + "%");
    }

    // Copiar objeto
    public Ativo copiar() {
        return new Ativo(nomeEmpresa, precoAcao, qtdAcoes, variacaoDiaria);
    }

    // Calcular posição do ativo
    public double calcularPosicaoDoAtivo() {
        return precoAcao * qtdAcoes;
    }

    // Exibir resumo completo
    public void exibirResumo() {
        System.out.println(
            nomeEmpresa + " | Preço: " + precoAcao +
            " | Qtd: " + qtdAcoes +
            " | Variação: " + variacaoDiaria + "%" +
            " | Posição: " + calcularPosicaoDoAtivo()
        );
    }
}
