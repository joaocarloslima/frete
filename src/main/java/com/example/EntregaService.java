package com.example;

import java.math.BigDecimal;

public class EntregaService {
    
    public BigDecimal calcularFrete(Entrega entrega){

        var valor = BigDecimal.ZERO;

        valor = new FreteCurto(entrega)
                // .ou(new FreteMedio(entrega))
                // .ou(new FreteLongo(entrega))
                .calcular();

        return valor;


        // if (entrega.getDistancia() <= 100){
        //     valor = entrega.getValor().multiply(new BigDecimal(0.1));
        // }else if(entrega.getDistancia() <= 500){
        //     valor = entrega.getValor().multiply(new BigDecimal(0.15));
        // }else{
        //     valor = entrega.getValor().multiply(new BigDecimal(0.2));
        // }

    }

}
