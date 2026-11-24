package com.qvision.stepDefinitions;

import com.qvision.tasks.ClickInicioSesion;
import com.qvision.tasks.IngresarDatosLogin;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class InicioSesionInvalidoStepDefinitions {

    @Dado("que ingreso a la pagina de iniciar sesion")
    public void queIngresoALaPaginaDeIniciarSesion() {
        theActorInTheSpotlight().attemptsTo(Open.relativeUrl("/"),
                ClickInicioSesion.irAInicioDeSesion());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }

    @Cuando("ingreso credenciales invalidas de inicio de sesion")
    public void ingresoCredencialesInvalidasDeInicioDeSesion() {
        theActorInTheSpotlight().attemptsTo(IngresarDatosLogin.ingresaCorreoYContrasena());

    }

    @Entonces("valido el mensaje de inicio de sesion fallido")
    public void validoElMensajeDeInicioDeSesionFallido() {



    }


}
