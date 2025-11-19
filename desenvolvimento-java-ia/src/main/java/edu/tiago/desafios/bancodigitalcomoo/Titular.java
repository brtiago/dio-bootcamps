package edu.tiago.desafios.bancodigitalcomoo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Titular {
    private String nome;
    private String cpf;
    private List<ContaBancaria> contas;

    public Titular(String nome, String cpf, int agencia, double saldo) {
        this.nome = nome;
        this.cpf = cpf;
        this.contas = new ArrayList<>();
        ContaBancaria conta = new ContaBancaria(agencia, saldo);
        contas.add(conta);
        confirmarConta(conta);
    }

    public Titular(String nome, String cpf, int agencia, double saldo, double taxaJuros) {
        this.nome = nome;
        this.cpf = cpf;
        this.contas = new ArrayList<>();
        ContaBancaria conta = new ContaPoupanca(agencia, saldo, taxaJuros);
        contas.add(conta);
        confirmarConta(conta);
    }

    public void listarContasPor(int numero){
        contas.stream()
                .filter(conta -> conta.getNumeroConta() == numero)
                .forEach(System.out::println);
    }

    public void confirmarConta(ContaBancaria conta) {
        System.out.println("Conta criada!");
        System.out.println("Titular=" + nome +
                ", CPF: " + cpf +
                ", Agência: " + conta.getAgencia() +
                ", Conta: " + conta.getNumeroConta() +
                ", Saldo: " + conta.getSaldo()
        );
    }

    public List<ContaBancaria> getContasPorCpf(String cpf) {
        if (Objects.equals(this.cpf, cpf)) {
            return contas.stream()
                    .collect(Collectors.toList());
        }
        return new ArrayList<>();
    }

    public List<ContaBancaria> getContas() {
        return new ArrayList<>(contas); // Retorna uma nova lista para manter a imutabilidade
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return "Titular{" +
                "Nome: " + nome +
                ", CPF: " + cpf +
                ", Contas: " + contas +
                '}';
    }
}
