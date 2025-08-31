package com.exemplo.padroes;

/**
 * Esta é a classe da Fábrica, que implementa o Padrão de Projeto Factory.
 * Ela é responsável por criar as instâncias de Notificacao sem que o cliente
 * precise saber dos detalhes de implementação de cada classe.
 */
public class NotificacaoFactory {

    /**
     * Cria e retorna uma instância de Notificacao com base no tipo especificado.
     *
     * @param tipo O tipo da notificação a ser criada (ex: "email", "sms", "push").
     * @return Uma instância da Notificacao correspondente.
     * @throws IllegalArgumentException se o tipo de notificação for desconhecido.
     */
    public Notificacao criarNotificacao(String tipo) {
        if (tipo == null || tipo.isEmpty()) {
            return null;
        }

        switch (tipo.toLowerCase()) {
            case "email":
                return new EmailNotificacao(); 
            case "sms":
                return new SMSNotificacao();
            case "push":
                return new PushNotificacao();
            default:
                throw new IllegalArgumentException("Tipo de notificação desconhecido: " + tipo);
        }
    }
}