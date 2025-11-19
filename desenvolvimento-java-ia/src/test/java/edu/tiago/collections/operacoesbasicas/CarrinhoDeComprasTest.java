package edu.tiago.collections.operacoesbasicas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarrinhoDeComprasTest {

    private CarrinhoDeCompras carrinho;

    @BeforeEach
    void setUp() {
        carrinho = new CarrinhoDeCompras();
    }

    @Test
    void deveriaRemoverItem() {
        // Verifica se o número de ítens do carrinho é 0 no início
        assertEquals(0, carrinho.obterQuantidadeItens());

        // Adiciona um ítem ao carrinho e verifica sua quantidade de ítens
        carrinho.adicionarItem("Abacate", 2.00, 2);
        assertEquals(1, carrinho.obterQuantidadeItens());

        // Adiciona mais um ítem ao carrinho e verifica a quantidade de ítens
        carrinho.adicionarItem("Banana", 1.50, 12);
        assertEquals(2, carrinho.obterQuantidadeItens());

        // Remove um item do carrinho e verifica a quantidade de ítens
        carrinho.removerItem("Banana");
        assertEquals(1, carrinho.obterQuantidadeItens());

        // Remove o último item e verifica se o número total de ítens é 0
        carrinho.removerItem("Abacate");
        assertEquals(0, carrinho.obterQuantidadeItens());
    }

    @Test
    void deveriaCalcularValorTotal() {
        // Verifica se o número de ítens do carrinho é 0 no início
        assertEquals(0, carrinho.obterQuantidadeItens());

        // Adiciona ítens ao carrinho
        carrinho.adicionarItem("Abacate", 2.00, 2);
        carrinho.adicionarItem("Banana", 1.50, 12);

        assertEquals(22.0, carrinho.calcularValorTotal());
    }

}