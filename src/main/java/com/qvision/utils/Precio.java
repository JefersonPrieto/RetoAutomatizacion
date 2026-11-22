package com.qvision.utils;

import java.math.BigDecimal;

public final class Precio {

    private Precio() {}

    public static BigDecimal desde(String numerotexto){
        return new BigDecimal(numerotexto.replaceAll("[^0-9]",""));
    }
}
