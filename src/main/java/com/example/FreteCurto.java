package com.example;

import java.math.BigDecimal;

public class FreteCurto extends Frete {

    public FreteCurto(Entrega entrega) {
        super(entrega);
    }

    @Override
    public BigDecimal calcular() {
        return entrega.getValor().multiply(new BigDecimal(0.1));
    }
    
    @Override
    public boolean aplicarFrete() {
        return entrega.getDistancia() <= 100;
    }
    
}
