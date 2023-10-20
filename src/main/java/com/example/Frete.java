package com.example;

import java.math.BigDecimal;

public abstract class Frete {
    
    protected Entrega entrega;

    public Frete(Entrega entrega) {
        this.entrega = entrega;
    }

    public abstract BigDecimal calcular();

    public final Frete ou(Frete proximo){
        if (aplicarFrete())
            return this;
        return proximo;
    }

    public abstract boolean aplicarFrete();


    
}
