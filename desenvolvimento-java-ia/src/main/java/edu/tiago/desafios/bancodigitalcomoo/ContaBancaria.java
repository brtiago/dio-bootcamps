package edu.tiago.desafios.bancodigitalcomoo;

public class ContaBancaria {
    private static int contadorContas = 1;
    protected int agencia;
    protected int numeroConta = 0;
    protected double saldo;

    public ContaBancaria(int agencia, double saldo) {
        this.agencia = agencia;
        this.saldo = saldo;
        this.numeroConta = contadorContas++;
    }

    public int getNumeroConta() {
        return numeroConta;
    }


    public int getAgencia() {
        return agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public double imprimirSaldo() {
        return this.saldo;
    }


    public void imprimirExtrato(int idConta){
        System.out.println("======= CONTA CORRENTE =======");
        System.out.println(String.format("Conta: %s", this.numeroConta));
        System.out.println(String.format("Saldo: %s", this.saldo));
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        } else {
            System.out.println("Valor de depósito deve ser positivo.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && this.saldo >= valor) {
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente ou valor de saque inválido.");
        }
    }

    public void transferir(double valor, ContaBancaria contaDestino) {
        if (valor > 0 && this.saldo >= valor) {
            this.sacar(valor);
            contaDestino.depositar(valor);
        } else {
            System.out.println("Saldo insuficiente ou valor de transferência inválido.");
        }
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "Ag: " + agencia +
                ", CC: " + numeroConta +
                ", Saldo: " + saldo +
                '}';
    }
}
