package com.qvision.questions;

import com.qvision.userInterfaces.HomePage;
import com.qvision.utils.Precio;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.Wait;

import java.math.BigDecimal;
import java.util.List;

import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.equalTo;

public class CatalogoOrdenadoPorPrecio implements Question<List<BigDecimal>> {

    public static CatalogoOrdenadoPorPrecio preciosMostrados() {
        return new CatalogoOrdenadoPorPrecio();
    }

    @Override
    public List<BigDecimal> answeredBy(Actor actor) {
        List<BigDecimal> preciosNumero;
        preciosNumero = actor.asksFor(Text.ofEach(HomePage.PRECIOS_PRODUCTOS))
                .stream().map(Precio::desde).toList();
        return preciosNumero;
    }
}
