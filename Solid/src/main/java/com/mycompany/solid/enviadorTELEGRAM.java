package com.mycompany.solid;

public class enviadorTELEGRAM implements IEnviadorMensagem {
    @Override
    public void enviarMensagem () {
        System.out.println("Mensagem enviada por telegram");
    }
}
