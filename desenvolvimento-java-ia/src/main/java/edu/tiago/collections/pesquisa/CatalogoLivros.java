package edu.tiago.collections.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private final List<Livro> catalogo;

    public CatalogoLivros() {
        this.catalogo = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        catalogo.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        if (autor == null || autor.trim().isEmpty()) {
            throw new IllegalArgumentException("O autor não pode ser nulo ou vazio.");
        }

        List<Livro> livrosPorAutor = new ArrayList<>();
        for (Livro livro : catalogo) {
            if(livro.getAutor().equalsIgnoreCase(autor)) {
                livrosPorAutor.add(livro);
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        if (anoInicial > anoFinal) {
            throw new IllegalArgumentException("Ano inicial não pode ser maior que ano final.");
        }

        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        for (Livro livro : catalogo) {
            if (livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal) {
                livrosPorIntervaloAnos.add(livro);
            }
        }
        return livrosPorIntervaloAnos;
    }


    public Livro pesquisarPorTitulo(String titulo) {
        if (titulo == null || titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("O título não pode ser nulo ou vazio.");
        }

        Livro livroPorTitulo = null;
        for (Livro livro : catalogo) {
            if(livro.getTitulo().equalsIgnoreCase((titulo))) {
                livroPorTitulo = livro;
            }
        }
        return livroPorTitulo;
    }
}
