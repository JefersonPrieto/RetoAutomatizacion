package com.qvision.tasks;

import com.qvision.userInterfaces.IniciarSesionPage;
import com.qvision.userInterfaces.NavBarPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class ClickInicioSesion implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(NavBarPage.BTN_INICIAR_SESION));
    }

    public static ClickInicioSesion irAInicioDeSesion() {
        return Tasks.instrumented(ClickInicioSesion.class);
    }
}
