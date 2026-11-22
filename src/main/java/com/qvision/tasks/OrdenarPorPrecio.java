package com.qvision.tasks;


import com.qvision.userInterfaces.FormularioRegistroPage;
import com.qvision.userInterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class OrdenarPorPrecio implements Task {

    public static OrdenarPorPrecio menorAMayorPrecio() {
        return Tasks.instrumented(OrdenarPorPrecio.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(HomePage.SELECT_ORDENAR, isVisible()).forNoMoreThan(10).seconds(),
                SelectFromOptions.byVisibleText("Precio (Bajo - Alto)").from(HomePage.SELECT_ORDENAR));
    }

}
