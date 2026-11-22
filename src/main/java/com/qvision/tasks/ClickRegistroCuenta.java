package com.qvision.tasks;

import com.qvision.userInterfaces.IniciarSesionPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class ClickRegistroCuenta implements Task {

    @Override
    public <T extends Actor> void performAs (T actor)  {
        actor.attemptsTo(Click.on(IniciarSesionPage.BTN_REGISTRAR_CUENTA));
    }
   public static ClickRegistroCuenta irAFormularioRegistro(){
        return Tasks.instrumented(ClickRegistroCuenta.class);
   }
}
