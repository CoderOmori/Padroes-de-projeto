package com.exemplo.padroes;

/**
 * Classe principal para demonstrar a aplicação dos padrões de projeto Factory e Singleton.
 * Esta classe atua como o cliente que utiliza as funcionalidades criadas.
 */
public class Main {
    public static void main(String[] args) {

        // --- Demonstração do Padrão Factory ---
        System.out.println("--- Padrão de Projeto: Factory ---");
        NotificacaoFactory factory = new NotificacaoFactory();

        // O cliente solicita uma notificação de email sem saber como ela é criada.
        // A fábrica abstrai a lógica de criação.
        Notificacao email = factory.criarNotificacao("email");
        if (email != null) {
            email.enviar();
        }

        // O cliente solicita uma notificação por SMS.
        Notificacao sms = factory.criarNotificacao("sms");
        if (sms != null) {
            sms.enviar();
        }

        // O cliente solicita uma notificação por push.
        Notificacao push = factory.criarNotificacao("push");
        if (push != null) {
            push.enviar();
        }

        System.out.println("\n----------------------------------------");

        // --- Demonstração do Padrão Singleton ---
        System.out.println("--- Padrão de Projeto: Singleton ---");

        // Ambas as chamadas ao método getInstance() retornarão a *mesma* instância.
        // O construtor privado impede a criação direta de um novo objeto.
        DatabaseConnectionManager connection1 = DatabaseConnectionManager.getInstance();
        DatabaseConnectionManager connection2 = DatabaseConnectionManager.getInstance();

        connection1.conectar();
        connection2.conectar();

        // O resultado será 'true', comprovando que as duas variáveis se referem
        // ao mesmo objeto na memória.
        System.out.println("As instâncias são a mesma? " + (connection1 == connection2));
    }
}