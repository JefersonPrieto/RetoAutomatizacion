package com.qvision.stepDefinitions;

import com.qvision.questions.CatalogoOrdenadoPorPrecio;
import com.qvision.tasks.OrdenarPorPrecio;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Open;

import java.math.BigDecimal;
import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class CatalogoPrecioStepDefinitions {

    @Dado("que ingreso al catalogo de productos")
        public void queIngresoAlCatalogoDeProductos() {
        theActorInTheSpotlight().attemptsTo(Open.relativeUrl("/"));
    }

    @Cuando("ordeno los productos de mayor a menor")
        public void OrdenoLosProductosDeMayorAMenor() {
        theActorInTheSpotlight().attemptsTo(OrdenarPorPrecio.menorAMayorPrecio());
    }

    @Entonces("valido que quedaron correctamente ordenados")
        public void validoQueQuedaronCorrectamenteOrdenados() {
        List<BigDecimal> preciosMostrados = theActorInTheSpotlight().asksFor(CatalogoOrdenadoPorPrecio.preciosMostrados());
        List<BigDecimal> preciosOrdenados = preciosMostrados.stream().sorted().toList();
        theActorInTheSpotlight().should(seeThat("", CatalogoOrdenadoPorPrecio.preciosMostrados(), equalTo(preciosOrdenados)));
    }


}
