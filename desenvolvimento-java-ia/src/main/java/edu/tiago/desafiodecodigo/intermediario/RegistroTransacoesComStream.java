package edu.tiago.desafiodecodigo.intermediario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RegistroTransacoesComStream {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // System.out.println("Informe o saldo inicial da conta: ");
        double saldo = scanner.nextDouble();
        // System.out.println("Informe a quantidade total de transações que deseja realizar: ");
        int quantidadeTransacoes = scanner.nextInt();

        List<Transacao> transacoes = new ArrayList<>();

        for (int i = 1; i <= quantidadeTransacoes; i++) {

            // System.out.println("Qual tipo de transação:\nDigite 'D' para depósito ou 'S' para saque.");
            char tipoTransacao = scanner.next().charAt(0);
            // System.out.println("Qual valor da transação? ");
            double valorTransacao = scanner.nextDouble();

            // TODO: Criar uma nova transação e adicioná-la à lista de transações
            Transacao transacao = new Transacao(tipoTransacao, valorTransacao);
            transacoes.add(transacao);

            // Verifica e atualiza o saldo da conta com base no tipo de transação
            if (Character.toUpperCase(transacao.getTipo()) == 'D') {
                saldo += valorTransacao;
            } else if (Character.toUpperCase(transacao.getTipo()) == 'S') {
                saldo -= valorTransacao;
            }
        }

        System.out.println("Saldo:" + saldo);
        System.out.println("Transacoes:");
        transacoes.stream()
                .map(transacao -> transacao.getTipo() +" de "+ transacao.getValor())
                .toList()
                .forEach(System.out::println);

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}

class Transacao {
    private char tipo;
    private double valor;

    public Transacao(char tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public char getTipo() { return tipo; }

    public double getValor() { return valor; }
}