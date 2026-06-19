package com.mycompany.solid;

public class enviadorSMS implements IEnviadorMensagem {
    @Override
    public void enviarMensagem() {
        System.out.println("Mensagem enviada por SMS");
    }
}
