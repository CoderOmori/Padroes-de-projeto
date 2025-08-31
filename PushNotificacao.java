package com.exemplo.padroes;

/**
 * Classe concreta que implementa a interface Notificacao.
 * Representa uma notificação do tipo push.
 */
public class PushNotificacao implements Notificacao {

    @Override
    public void enviar() {
        System.out.println("Enviando notificação por push...");
    }
}