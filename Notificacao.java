package com.exemplo.padroes;

/**
 * Interface que define o contrato para todas as classes de notificação.
 * Faz parte do Padrão de Projeto Factory, permitindo que a fábrica
 * retorne objetos de tipos diferentes que compartilham a mesma
 * funcionalidade básica.
 */
public interface Notificacao {

    /**
     * Método para enviar a notificação.
     * Deve ser implementado por todas as classes de notificação concretas.
     */
    void enviar();
}