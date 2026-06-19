package com.mycompany.solid;

public class enviadorEMAIL implements IEnviadorMensagem{
    @Override
    public void enviarMensagem () {
        System.out.println("Mensagem enviada por Email");
    }
}
