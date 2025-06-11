# 📝 Conta Terminal - Projeto Java

Um projeto simples em Java que simula a criação de uma conta bancária via terminal, desenvolvido como parte do desafio da DIO (Digital Innovation One).

## 📋 Descrição

Este projeto permite que usuários insiram dados bancários (número da conta, agência, nome do cliente e saldo) via terminal e recebam uma mensagem personalizada com as informações cadastradas.

## 🛠️ Tecnologias Utilizadas

- Java (JDK 11+)
- Scanner (para entrada de dados)
- Formatação com `printf`

## ⚙️ Como Executar o Projeto

### Pré-requisitos
- Java JDK 11 ou superior instalado
- Git (opcional, para clonar o repositório)

### Passo a Passo

1. **Clone o repositório (ou copie o código):**
   ```bash
   git clone https://github.com/seu-usuario/conta-terminal.git
   cd conta-terminal
   ```

2. **Compile o arquivo Java:**
   ```bash
   javac ContaTerminal.java
   ```

3. **Execute o programa:**
   ```bash
   java ContaTerminal
   ```

4. **Siga as instruções no terminal:**
    - Insira o número da conta
    - Digite a agência
    - Informe seu nome completo
    - Adicione o saldo inicial

5. **Veja o resultado:**
   O programa exibirá uma mensagem personalizada com todos os dados inseridos.

## 📝 Exemplo de Uso

```bash
Por favor, informe os dados do cliente:
-------------------------------------
Número da Conta: 
> 1021
Agência:
> 067-8
Nome do Cliente:
> MARIO ANDRADE
Saldo inicial:
> 237.48
-------------------------------------
Olá, MARIO ANDRADE! Obrigado por escolher nosso banco!
Sua agência é: 067-8 e a sua conta: 1021
O seu saldo no valor de R$ 237.48 já está disponível.
```

## 📌 Melhorias Futuras

- Validação de entrada de dados
- Persistência em arquivo
- Interface gráfica

## 🤝 Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou pull requests.

---

Desenvolvido como parte do desafio da [DIO](https://www.dio.me/) - Trilha Java Básico