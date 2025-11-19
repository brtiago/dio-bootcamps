package edu.tiago.designpatterns.factorymethod.solucao;

import edu.tiago.designpatterns.factorymethod.Produto;
import edu.tiago.designpatterns.factorymethod.TipoProdutoEnum;

public class TesteProdutoComFactoryMethod {

    public static void main(String[] args) {
        Produto produtoDigital = ProdutoFactory.getInstance(TipoProdutoEnum.DIGITAL);
        Produto produtoFisico  = ProdutoFactory.getInstance(TipoProdutoEnum.FISICO);

        System.out.println(produtoDigital);
        System.out.println(produtoFisico);
    }
}
