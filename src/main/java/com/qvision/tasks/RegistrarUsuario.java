package com.qvision.tasks;

import com.qvision.userInterfaces.FormularioRegistroPage;
import com.qvision.utils.GeneradorCorreo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class RegistrarUsuario implements Task {

    @Override
    public <T extends Actor> void performAs(T actor){
        String correoGenerado = GeneradorCorreo.correoAleatorio();
        String contraseña = "Credibanco2026**";
        WaitUntil.the(FormularioRegistroPage.BTN_REGISTRAR, isVisible()).forNoMoreThan(10).seconds();
        actor.attemptsTo(Enter.theValue("Jeferson").into(FormularioRegistroPage.TXT_NOMBRE));
        actor.attemptsTo(Enter.theValue("Prieto").into(FormularioRegistroPage.TXT_APELLIDO));
        actor.attemptsTo(Enter.theValue("2001-04-16").into(FormularioRegistroPage.TXT_FECHA_NACIMIENTO));
        actor.attemptsTo(SelectFromOptions.byVisibleText("Colombia").from(FormularioRegistroPage.SLC_PAIS));
        actor.attemptsTo(Enter.theValue("5514").into(FormularioRegistroPage.TXT_CODIGO_POSTAL));
        actor.attemptsTo(Enter.theValue("1234567").into(FormularioRegistroPage.TXT_NUMERO));
        actor.attemptsTo(Enter.theValue("CALLE#54B 14").into(FormularioRegistroPage.TXT_CALLE));
        actor.attemptsTo(Enter.theValue("BOGOTA").into(FormularioRegistroPage.TXT_CIUDAD));
        actor.attemptsTo(Enter.theValue("CREDIBANCO").into(FormularioRegistroPage.TXT_ESTADO));
        actor.attemptsTo(Enter.theValue("3214217731").into(FormularioRegistroPage.TXT_TELEFONO));
        actor.attemptsTo(Enter.theValue(correoGenerado).into(FormularioRegistroPage.TXT_CORREO));
        actor.remember("CorreoRegistrado", correoGenerado);
        actor.attemptsTo(Enter.theValue(contraseña).into(FormularioRegistroPage.TXT_CONTRASEÑA));
        actor.remember("ContraseñaRegistrada",contraseña);
        actor.attemptsTo(Click.on(FormularioRegistroPage.BTN_REGISTRAR));
    }

    public static RegistrarUsuario creoUsuarioNuevo(){
        return Tasks.instrumented(RegistrarUsuario.class);
    }


}
