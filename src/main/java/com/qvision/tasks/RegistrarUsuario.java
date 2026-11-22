package com.qvision.tasks;

import com.qvision.userInterfaces.FormularioRegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class RegistrarUsuario implements Task {

    @Override
    public <T extends Actor> void performAs(T actor){
        WaitUntil.the(FormularioRegisterPage.BTN_REGISTRAR, isVisible()).forNoMoreThan(10).seconds();
        actor.attemptsTo(Enter.theValue("Jeferson").into(FormularioRegisterPage.TXT_NOMBRE));
        actor.attemptsTo(Enter.theValue("Prieto").into(FormularioRegisterPage.TXT_APELLIDO));
        actor.attemptsTo(Enter.theValue("2001-04-16").into(FormularioRegisterPage.TXT_FECHA_NACIMIENTO));
        actor.attemptsTo(SelectFromOptions.byVisibleText("Colombia").from(FormularioRegisterPage.SLC_PAIS));
        actor.attemptsTo(Enter.theValue("5514").into(FormularioRegisterPage.TXT_CODIGO_POSTAL));
        actor.attemptsTo(Enter.theValue("1234567").into(FormularioRegisterPage.TXT_NUMERO));
        actor.attemptsTo(Enter.theValue("CALLE#54B 14").into(FormularioRegisterPage.TXT_CALLE));
        actor.attemptsTo(Enter.theValue("BOGOTA").into(FormularioRegisterPage.TXT_CIUDAD));
        actor.attemptsTo(Enter.theValue("CREDIBANCO").into(FormularioRegisterPage.TXT_ESTADO));
        actor.attemptsTo(Enter.theValue("3214217731").into(FormularioRegisterPage.TXT_TELEFONO));
        actor.attemptsTo(Enter.theValue("JefersonPrueba@credibanco.com").into(FormularioRegisterPage.TXT_CORREO));
        actor.attemptsTo(Enter.theValue("Credibanco2026**").into(FormularioRegisterPage.TXT_CONTRASEÑA));
        //actor.attemptsTo(Click.on(FormularioRegisterPage.BTN_REGISTRAR));
    }

    public static RegistrarUsuario creoUsuarioNuevo(){
        return Tasks.instrumented(RegistrarUsuario.class);
    }


}
