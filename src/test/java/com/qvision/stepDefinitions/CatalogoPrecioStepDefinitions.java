package com.qvision.stepDefinitions;

import com.qvision.tasks.OrdenarPorPrecio;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

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


    }


}
