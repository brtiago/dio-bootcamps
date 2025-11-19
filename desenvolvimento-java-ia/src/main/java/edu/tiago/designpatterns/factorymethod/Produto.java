package edu.tiago.designpatterns.factorymethod;

import java.math.BigDecimal;

public class Produto {

    private String descricao;
    private BigDecimal preco;
    private Boolean possuiDimensoesFisicas;

    public void setPossuiDimensoesFisicas(Boolean possuiDimensoesFisicas) {
        this.possuiDimensoesFisicas = possuiDimensoesFisicas;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "descricao='" + descricao + '\'' +
                ", preco=" + preco +
                ", possuiDimensoesFisicas=" + possuiDimensoesFisicas +
                '}';
    }
}
