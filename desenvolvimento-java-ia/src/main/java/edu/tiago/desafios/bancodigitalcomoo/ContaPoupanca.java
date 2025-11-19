package edu.tiago.desafios.bancodigitalcomoo;

public class ContaPoupanca extends ContaBancaria {
    private double taxaJuros;

    public ContaPoupanca(int agencia, double saldo, double taxaJuros) {
        super(agencia, saldo);
        this.taxaJuros = taxaJuros;
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    public void aplicarJuros() {
        double juros = getSaldo() * (taxaJuros / 100);
        depositar(juros);
    }

    @Override
    public String toString() {
        return "ContaPoupanca{" + "Juros=" +
                taxaJuros +"%" +
                ", Agência=" + agencia +
                ", Conta=" + numeroConta +
                ", Saldo=" + saldo +
                '}';
    }
}
