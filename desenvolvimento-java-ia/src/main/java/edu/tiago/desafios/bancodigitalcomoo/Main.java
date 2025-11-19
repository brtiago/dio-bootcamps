package edu.tiago.desafios.bancodigitalcomoo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê a Entrada que informa o nome do banco
        System.out.println("Informe o nome do banco: ");
        Banco banco = new Banco(scanner.nextLine());

        // Criar e cadastrar titulares com base no tipo de conta
        System.out.println("Informe o tipo de conta: ('corrente' ou 'poupanca')");
        String tipoConta = scanner.nextLine().toLowerCase();
        Titular titular;

        switch (tipoConta) {
            case "corrente":
                titular = new Titular("Paulo", "669", 31, 100.0);
                banco.cadastrarTitular(titular);
                break;
            case "poupanca":
                titular = new Titular("Paulo", "669", 31, 100.0, 0.1);
                banco.cadastrarTitular(titular);
                break;
            default:
                System.out.println("Opção inválida");
                scanner.close();
                return;
        }

        System.out.println(titular);

        // Adicionar mais operações para interação do usuário
        while (true) {
            System.out.println("Escolha uma operação: 1. Depositar, 2. Sacar, 3. Transferir, 4. Sair");
            int operacao = scanner.nextInt();
            switch (operacao) {
                case 1:
                    System.out.println("Informe o valor para depósito:");
                    double valorDeposito = scanner.nextDouble();
                    titular.getContas().get(0).depositar(valorDeposito);
                    break;
                case 2:
                    System.out.println("Informe o valor para saque:");
                    double valorSaque = scanner.nextDouble();
                    titular.getContas().get(0).sacar(valorSaque);
                    break;
                case 3:
                    System.out.println("Informe o valor para transferência:");
                    double valorTransferencia = scanner.nextDouble();
                    System.out.println("Informe a conta de destino (número da conta):");
                    int contaDestinoNumero = scanner.nextInt();
                    ContaBancaria contaDestino = null;
                    for (Titular t : banco.listarTodosTitulares()) {
                        for (ContaBancaria conta : t.getContas()) {
                            if (conta.getNumeroConta() == contaDestinoNumero) {
                                contaDestino = conta;
                                break;
                            }
                        }
                    }
                    if (contaDestino != null) {
                        titular.getContas().get(0).transferir(valorTransferencia, contaDestino);
                    } else {
                        System.out.println("Conta de destino não encontrada.");
                    }
                    break;
                case 4:
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }
}