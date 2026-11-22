package com.qvision.tasks;

import com.qvision.userInterfaces.IniciarSesionPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ClickRegistroCuenta implements Task {

    @Override
    public <T extends Actor> void performAs (T actor)  {
        actor.attemptsTo(
                WaitUntil.the(IniciarSesionPage.BTN_REGISTRAR_CUENTA, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(IniciarSesionPage.BTN_REGISTRAR_CUENTA));
    }
   public static ClickRegistroCuenta irAFormularioRegistro(){
        return Tasks.instrumented(ClickRegistroCuenta.class);
   }
}
