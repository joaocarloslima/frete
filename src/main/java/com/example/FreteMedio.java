package com.example;

import java.math.BigDecimal;

public class FreteMedio implements Frete {

    private Entrega entrega;

    public FreteMedio(Entrega entrega) {
        this.entrega = entrega;
    }

    @Override
    public BigDecimal calcular() {
        return entrega.getValor().multiply(new BigDecimal(0.15));
    }

    @Override
    public Frete ou(Frete proximo) {
        if (entrega.getDistancia() <= 500)
            return this;
        return proximo;
    }
    
}
