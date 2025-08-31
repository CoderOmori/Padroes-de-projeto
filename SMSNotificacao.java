package com.exemplo.padroes;

/**
 * Classe concreta que implementa a interface Notificacao.
 * Representa uma notificação por SMS.
 */
public class SMSNotificacao implements Notificacao {

    @Override
    public void enviar() {
        System.out.println("Enviando notificação por SMS...");
    }
}