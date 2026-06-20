package com.mycompany.solid.ClassesSolid;
public class servicoFinanceiro implements IConversorMoeda {
    public void realizarTransacao () {
        IConversorMoeda conversor = new conversorMoedaDolar();
        conversor.converterParaDolar();
        converterParaReal();
    }
}
