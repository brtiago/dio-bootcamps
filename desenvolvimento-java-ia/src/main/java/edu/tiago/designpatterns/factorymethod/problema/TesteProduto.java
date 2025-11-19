package edu.tiago.designpatterns.factorymethod.problema;

import edu.tiago.designpatterns.factorymethod.Produto;
import edu.tiago.designpatterns.factorymethod.ProdutoDigital;
import edu.tiago.designpatterns.factorymethod.ProdutoFisico;

public class TesteProduto {

    public static void main(String[] args) {
        Produto produtoFisico = new ProdutoFisico();
        produtoFisico.setPossuiDimensoesFisicas(true);

        Produto produtoDigital = new ProdutoDigital();
        produtoDigital.setPossuiDimensoesFisicas(false);
    }
}
