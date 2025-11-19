# Desafio de Projeto: Criando um Banco Digital com Java e Orientação a Objetos

* Objetivo: O objetivo deste projeto prático hands-on é reforçar o conhecimento em Programação Orientada a Objetos (POO) em Java, através da implementação de um banco digital.

* Descrição: Neste projeto, será disponibilizado no GitHub um projeto de referência que utiliza os conceitos de POO e Java para criar um banco digital. O contexto bancário será explorado para explorar os pilares da orientação a objetos, e assim, os participantes poderão reproduzir a solução e desenvolver sua capacidade de abstração.

* liste todos os clientes
* incluir lombok no codigo

```mermaid
---
title: Criando um Banco Digital com Java e Orientação a Objetos
---
classDiagram
    class Banco {
        - String nome
        - List~Titular~ titulares
        + Banco(String nome)
        + void cadastrarTitular(Titular titular)
        + List~Titular~ listarTodosTitulares()
        + String getNome()
        + void setNome(String nome)
        + String toString()
    }

    class Titular {
        - String nome
        - String cpf
        - List~ContaBancaria~ contas
        + Titular(String nome, String cpf, int agencia, double saldo)
        + Titular(String nome, String cpf, int agencia, double saldo, double taxaJuros)
        + void listarContasPorNumero(int numero)
        + void confirmarConta(ContaBancaria conta)
        + List~ContaBancaria~ getContasPorCpf(String cpf)
        + List~ContaBancaria~ getContas()
        + String getNome()
        + String getCpf()
        + String toString()
    }

    class ContaBancaria {
        - static int contadorContas
        - int agencia
        - int numeroConta
        - double saldo
        + ContaBancaria(int agencia, double saldo)
        + int getNumeroConta()
        + int getAgencia()
        + double getSaldo()
        + double imprimirSaldo()
        + void imprimirExtrato()
        + void depositar(double valor)
        + void sacar(double valor)
        + void transferir(double valor, ContaBancaria contaDestino)
        + String toString()
    }

    class ContaPoupanca {
        - double taxaJuros
        + ContaPoupanca(int agencia, double saldo, double taxaJuros)
        + double getTaxaJuros()
        + void setTaxaJuros(double taxaJuros)
        + void aplicarJuros()
        + String toString()
    }

    Banco --> Titular
    Titular --> ContaBancaria
    ContaPoupanca --|> ContaBancaria
```

#### Links úteis
[Bootcamp DIO](https://web.dio.me/lab/criando-um-banco-digital-com-java-e-orientacao-objetos/)
