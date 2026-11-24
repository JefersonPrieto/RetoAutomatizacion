package com.qvision.tasks;

import com.qvision.userInterfaces.FormularioRegistroPage;
import com.qvision.userInterfaces.IniciarSesionPage;
import com.qvision.utils.GeneradorCorreo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class IngresarDatosLogin implements Task {

    public static IngresarDatosLogin ingresaCorreoYContrasena()
    {
        return Tasks.instrumented(IngresarDatosLogin.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(IniciarSesionPage.TXT_CORREO_ELECTRONICO, isVisible()),
                Enter.theValue(actor.recall("CorreoRegistrado").toString()).into(IniciarSesionPage.TXT_CORREO_ELECTRONICO),
                Enter.theValue(actor.recall("ContraseñaRegistrada").toString()).into(IniciarSesionPage.TXT_CONTRASEÑA));
        actor.attemptsTo(Click.on(IniciarSesionPage.BTN_INICIAR_SESION));
    }
}
