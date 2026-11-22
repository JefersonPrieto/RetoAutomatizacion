package com.qvision.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class CatalogoOrdenadoPorPrecio implements Question <Boolean> {

    public static CatalogoOrdenadoPorPrecio estaVisible(){
        return new CatalogoOrdenadoPorPrecio();
    }

    @Override
    public Boolean answeredBy(Actor actor) {



    }
}
