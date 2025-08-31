package com.exemplo.padroes;

/**
 * Classe concreta que implementa a interface Notificacao.
 * Representa uma notificação por email.
 */
public class EmailNotificacao implements Notificacao {

    @Override
    public void enviar() {
        System.out.println("Enviando notificação por email...");
    }
}