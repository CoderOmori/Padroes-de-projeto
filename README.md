# 📦 Projeto Java: Padrões de Projeto (Factory & Singleton)

Este projeto é uma demonstração prática de dois dos **padrões de projeto mais importantes** em Java:  
**Factory** e **Singleton**.  
O objetivo é mostrar como aplicá-los para tornar o código mais **flexível**, **desacoplado** e **fácil de manter**.

---

## 🧠 Padrões de Projeto Utilizados

### 🏭 Factory Pattern

- **Conceito**: Abstrai a criação de objetos.  
  Em vez de instanciar classes diretamente, o cliente utiliza uma *fábrica* para decidir qual objeto criar.

- **Neste Projeto**:  
  A classe `NotificacaoFactory` é usada para criar diferentes tipos de notificações:

  - `EmailNotificacao`
  - `SMSNotificacao`
  - `PushNotificacao`

  Isso evita que a lógica de criação fique na classe principal (`Main`), promovendo maior desacoplamento.

---

### 🔒 Singleton Pattern

- **Conceito**: Garante que uma classe tenha **apenas uma instância**, fornecendo um ponto de acesso global a ela.

- **Neste Projeto**:  
  A classe `DatabaseConnectionManager` é implementada como **Singleton**, garantindo que exista apenas uma conexão com o banco de dados durante toda a execução da aplicação.

---

## 📌 Observações

- Este projeto é **educacional** e pode servir como base para aplicações mais robustas.
- Os padrões **Factory** e **Singleton** são amplamente utilizados na **engenharia de software moderna**, sendo recomendados para sistemas **escaláveis** e de **fácil manutenção**.

---

