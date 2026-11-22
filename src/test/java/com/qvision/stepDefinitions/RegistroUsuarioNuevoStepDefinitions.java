package com.qvision.stepDefinitions;

import com.qvision.tasks.ClickInicioSesion;
import com.qvision.tasks.ClickRegistroCuenta;
import com.qvision.tasks.RegistrarUsuario;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RegistroUsuarioNuevoStepDefinitions {

    @Dado("que ingreso al formulario de registro de usuario")
    public void queIngresoAlFormularioDeRegistroDeUsuario() {
        theActorInTheSpotlight().attemptsTo(Open.relativeUrl("/"),
                ClickInicioSesion.irAInicioDeSesion(),
                ClickRegistroCuenta.irAFormularioRegistro());
    }

    @Cuando("registro todos los datos y creo el usuario")
    public void registroTodosLosDatosYCreoElUsuario() {
        theActorInTheSpotlight().attemptsTo(RegistrarUsuario.creoUsuarioNuevo());
    }
}
