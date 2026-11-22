package com.qvision.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;



public class HomePage {

    public static final Target SELECT_ORDENAR = Target.
            the("Seleccionar filtro para ordenar productos por recio de menor a mayor").
            locatedBy("//select[@data-test = 'sort']");

    public static final Target PRECIOS_PRODUCTOS = Target.
            the("Todos los precios de los productos").
            locatedBy("//span[@data-test = 'product-price']");

    public static final Target NOMBRE_PRIMER_PRODUCTO = Target.
            the("Todos los precios de los productos").
            locatedBy("(//h5[@data-test = 'product-name'])[1]");
}
