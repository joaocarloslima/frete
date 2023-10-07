package com.example;

import java.math.BigDecimal;

public interface Frete {

    public BigDecimal calcular();
    public Frete ou(Frete frete);
    
}
