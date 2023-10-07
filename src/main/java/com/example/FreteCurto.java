package com.example;

import java.math.BigDecimal;

public class FreteCurto implements Frete {

    private Entrega entrega;

    public FreteCurto(Entrega entrega) {
        this.entrega = entrega;
    }

    @Override
    public BigDecimal calcular() {
        return entrega.getValor().multiply(new BigDecimal(0.1));
    }
    
    @Override
    public Frete ou(Frete proximo) {
        if (entrega.getDistancia() <= 100) 
            return this;

        return proximo;
        
    }
    
}
