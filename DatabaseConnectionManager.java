package com.exemplo.padroes;

/**
 * Esta classe implementa o Padrão de Projeto Singleton.
 * Garante que apenas uma única instância desta classe possa ser
 * criada em toda a aplicação.
 */
public class DatabaseConnectionManager {

    // A única instância da classe. O modificador 'volatile' garante
    // que a instância seja visível para todas as threads, prevenindo
    // problemas em ambientes multithread.
    private static volatile DatabaseConnectionManager instance;

    /**
     * Construtor privado para evitar a criação de instâncias diretas
     * de fora da classe.
     */
    private DatabaseConnectionManager() {
        // Simulação da lógica de inicialização da conexão com o banco de dados.
        // Isso só será executado na primeira e única vez em que a instância for criada.
        System.out.println("Conexão com o banco de dados inicializada.");
    }

    /**
     * Método estático e público que fornece o ponto de acesso global à instância única.
     * O "double-checked locking" garante segurança de threads com bom desempenho.
     *
     * @return A única instância de DatabaseConnectionManager.
     */
    public static DatabaseConnectionManager getInstance() {
        if (instance == null) {
            // Bloco de sincronização para garantir que apenas uma thread
            // crie a instância na primeira vez.
            synchronized (DatabaseConnectionManager.class) {
                if (instance == null) {
                    instance = new DatabaseConnectionManager();
                }
            }
        }
        return instance;
    }

    /**
     * Método de exemplo que utiliza a conexão.
     */
    public void conectar() {
        System.out.println("Conectando ao banco de dados...");
    }
}