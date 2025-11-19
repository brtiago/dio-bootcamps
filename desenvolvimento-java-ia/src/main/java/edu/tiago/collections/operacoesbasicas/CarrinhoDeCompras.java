package edu.tiago.collections.operacoesbasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        itemList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("A lista de itens não pode ser nula.");
        }
        List<Item> itemParaRemover = new ArrayList<>();
        for (Item i : itemList) {
            if (i.getNome().equalsIgnoreCase(nome)) {
                itemParaRemover.add(i);
            }
        }
        itemList.removeAll(itemParaRemover);
    }

    public double calcularValorTotal() {
        if (itemList == null) {
            throw new IllegalArgumentException("A lista de itens não pode ser nula.");
        }

        double valorTotal = 0d;
        for (Item i : itemList) {
            double valorItem = i.getPreco() * i.getQuantidade();
            valorTotal += valorItem;
        }
        return valorTotal;
    }


    public void exibirItens() {
        if (itemList == null) {
            throw new IllegalArgumentException("A lista de itens não pode ser nula.");
        }
        System.out.println(this.itemList);
    }

    public int obterQuantidadeItens() {
        return itemList.size();
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras{" +
                "itemList=" + itemList +
                '}';
    }
}
