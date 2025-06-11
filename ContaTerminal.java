import java.util.Scanner;

public class ContaTerminal {

        public static void main(String[] args) {

            try(Scanner in = new Scanner(System.in)) {

                System.out.println("Por favor, informe os dados do cliente:");
                System.out.println("-------------------------------------");

                System.out.println("Número da Conta: ");
                System.out.print("> ");
                int numeroConta = in.nextInt();
                in.nextLine();

                System.out.println("Agência:");
                System.out.print("> ");
                String agencia = in.nextLine();

                System.out.println("Nome do Cliente:");
                System.out.print("> ");
                String nomeCliente = in.nextLine();

                System.out.println("Saldo inicial:");
                System.out.print("> ");
                double saldo = in.nextDouble();

                System.out.println("-------------------------------------");
                System.out.printf("Olá, %s! Obrigado por escolher nosso banco!", nomeCliente);
                System.out.println();
                System.out.printf("Sua agência é: %s e a sua conta: %d", agencia, numeroConta);
                System.out.printf("O seu saldo no valor de R$ %.2f já está disponível.%n", saldo);

            }
        }
    }

