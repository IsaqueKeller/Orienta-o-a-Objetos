package com.mycompany.solid;

public class processadorMensagem implements IEnviadorMensagem {
    IEnviadorMensagem enviador;
    public void processar () {
        enviarMensagem();
    }
}
