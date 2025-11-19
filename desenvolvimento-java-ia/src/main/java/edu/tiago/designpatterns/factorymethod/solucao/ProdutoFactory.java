package edu.tiago.designpatterns.factorymethod.solucao;

import edu.tiago.designpatterns.factorymethod.Produto;
import edu.tiago.designpatterns.factorymethod.ProdutoDigital;
import edu.tiago.designpatterns.factorymethod.ProdutoFisico;
import edu.tiago.designpatterns.factorymethod.TipoProdutoEnum;

public class ProdutoFactory {

    public static Produto getInstance(TipoProdutoEnum tipoProdutoEnum){
        switch (tipoProdutoEnum){
            case FISICO:
                Produto produtoFisico = new ProdutoFisico();
                produtoFisico.setPossuiDimensoesFisicas(true);
                return produtoFisico;

            case DIGITAL:
                Produto produtoDigital = new ProdutoDigital();
                produtoDigital.setPossuiDimensoesFisicas(false);
                return produtoDigital;

            default:
                throw new IllegalArgumentException("Tipo de produto indisponível");
        }
    }


}
