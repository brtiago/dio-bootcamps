package edu.tiago.desafios.bancodigitalcomoo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Banco {
    String nome;
    private List<Titular> titulares;

    public Banco(String nome) {
        this.nome = nome;
        this.titulares = new ArrayList<>();
    }

    public void cadastrarTitular(Titular titular) {
        titulares.add(titular);
    }

    public List<Titular> listarTodosTitulares() {
        return Collections.unmodifiableList(titulares);
    }

    public String getNome() {
        return nome;
    }

    public void setNome() {
        this.nome = nome;
    }


    @Override
    public String toString() {
        return "Banco{" +
                "Nome:" + nome +
                ", Titulares=" + titulares +
                ", Contas=" + listarTodosTitulares()+
                '}';
    }
}

