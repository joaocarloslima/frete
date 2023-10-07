package com.example;

import java.math.BigDecimal;


public class Entrega {
    
    private BigDecimal valor;
    private Integer distancia;

    public Entrega valor(BigDecimal valor) {
        this.valor = valor;
        return this;
    }

    public Entrega distancia(Integer distancia) {
        this.distancia = distancia;
        return this;
    }

    @Override
    public String toString() {
        return "Entrega [valor=" + valor + ", distancia=" + distancia + "]";
    }

    public BigDecimal getValor() {
        return valor;
    }

    public Integer getDistancia() {
        return distancia;
    }

    



}
