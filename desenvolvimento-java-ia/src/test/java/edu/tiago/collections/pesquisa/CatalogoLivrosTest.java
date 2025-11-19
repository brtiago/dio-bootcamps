package edu.tiago.collections.pesquisa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CatalogoLivrosTest {

    private CatalogoLivros catalogo;

    @BeforeEach
    void setUp() {
        catalogo = new CatalogoLivros();
        catalogo.adicionarLivro("Livro 1", "Autor 1", 2020);
        catalogo.adicionarLivro("Livro 1", "Autor 2", 2021);
        catalogo.adicionarLivro("Livro 2", "Autor 2", 2022);
        catalogo.adicionarLivro("Livro 3", "Autor 3", 2023);
        catalogo.adicionarLivro("Livro 4", "Autor 4", 2024);
    }

    @Test
    void deveriaAdicionarLivro() {
        catalogo.adicionarLivro("Livro 5", "Autor 1", 2025);
        assertEquals("Livro 5", catalogo.pesquisarPorTitulo("Livro 5").getTitulo());
    }

    @Test
    void pesquisarPorAutorDeveLancarExceptionQuandoAutorForNulo() {
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            catalogo.pesquisarPorAutor(null);
        });
        assertEquals("O autor não pode ser nulo ou vazio.", thrown.getMessage());
    }

    @Test
    void pesquisarPorAutorDeveLancarExceptionQuandoAutorForVazio() {
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            catalogo.pesquisarPorAutor("  ");
        });
        assertEquals("O autor não pode ser nulo ou vazio.", thrown.getMessage());
    }

    @Test
    void pesquisarPorAutorDeveRetornarLivrosCorretos() {
        List<Livro> livrosDoAutorA = catalogo.pesquisarPorAutor("Autor A");
        assertEquals(2, livrosDoAutorA.size());
        assertTrue(livrosDoAutorA.stream().allMatch(livro -> livro.getAutor().equalsIgnoreCase("Autor A")));

        List<Livro> livrosDoAutorB = catalogo.pesquisarPorAutor("Autor B");
        assertEquals(1, livrosDoAutorB.size());
        assertTrue(livrosDoAutorB.stream().allMatch(livro -> livro.getAutor().equalsIgnoreCase("Autor B")));
    }

    @Test
    void pesquisarPorAutorDeveRetornarListaVaziaQuandoAutorNaoEncontrado() {
        List<Livro> livrosDoAutorC = catalogo.pesquisarPorAutor("Autor C");
        assertTrue(livrosDoAutorC.isEmpty());
    }
    @Test
    void pesquisarPorIntervaloAnos() {
    }

    @Test
    void pesquisarPorTitulo() {
    }
}