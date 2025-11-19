package edu.tiago.designpatterns.builder.problema;

import edu.tiago.designpatterns.builder.Pessoa;

public class TestePessoa {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("José","das Couves", "669", "josedascouves@email.com", "espinafre", "12/04/2000");

        System.out.println(pessoa);
    }
}
