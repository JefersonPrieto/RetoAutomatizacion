package com.qvision.stepDefinitions;

import com.qvision.questions.FormularioInicioSesion;
import com.qvision.questions.InicioMiCuenta;
import com.qvision.tasks.ClickInicioSesion;
import com.qvision.tasks.ClickRegistroCuenta;
import com.qvision.tasks.IngresarDatosLogin;
import com.qvision.tasks.RegistrarUsuario;
import com.qvision.userInterfaces.MiCuentaPage;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.is;

public class RegistroUsuarioNuevoStepDefinitions {

    @Dado("que ingreso al formulario de registro de usuario")
    public void queIngresoAlFormularioDeRegistroDeUsuario() {
        theActorInTheSpotlight().attemptsTo(Open.relativeUrl("/"),
                ClickInicioSesion.irAInicioDeSesion(),
                ClickRegistroCuenta.irAFormularioRegistro());
    }

    @Y("completo los datos del formulario y creo el nuevo usuario")
    public void registroTodosLosDatosYCreoElUsuario() {
        theActorInTheSpotlight().attemptsTo(RegistrarUsuario.creoUsuarioNuevo());
        theActorInTheSpotlight().should(seeThat("Página de iniciar sesión es visible", FormularioInicioSesion.estaVisible(), is(true)));
    }

    @Cuando("inicio sesión con el nuevo usuario recién creado")
    public void inicioSesionConElNuevoUsuarioRecienCreado() {
        theActorInTheSpotlight().attemptsTo(IngresarDatosLogin.ingresaCorreoYContrasena());
    }

    @Entonces("ingreso exitosamente al perfil")
    public void ingresoExitosamenteAlPerfil() {
        theActorInTheSpotlight().should(seeThat("Página de mi cuenta es visible", InicioMiCuenta.estaVisible(), is(true)));
    }
}
