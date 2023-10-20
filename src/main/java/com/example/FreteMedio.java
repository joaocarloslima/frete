package com.example;

import java.math.BigDecimal;

public class FreteMedio extends Frete {

    public FreteMedio(Entrega entrega) {
        super(entrega);
    }

    @Override
    public BigDecimal calcular() {
        return entrega.getValor().multiply(new BigDecimal(0.15));
    } 

    @Override
    public boolean aplicarFrete() {
        return entrega.getDistancia() <= 500;
    }
    
}
