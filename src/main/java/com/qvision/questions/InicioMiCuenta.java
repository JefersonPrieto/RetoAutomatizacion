package com.qvision.questions;

import com.qvision.userInterfaces.IniciarSesionPage;
import com.qvision.userInterfaces.MiCuentaPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;
import net.serenitybdd.screenplay.questions.page.TheWebPage;

public class InicioMiCuenta implements Question<Boolean> {

    public static InicioMiCuenta estaVisible(){
        return new InicioMiCuenta();
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        boolean TextVisible = actor.asksFor(Visibility.of(MiCuentaPage.TXT_MICUENTA));
        boolean BTNVisible = actor.asksFor(Visibility.of(MiCuentaPage.BTN_PERFIL));
        boolean PageVisible = actor.asksFor(TheWebPage.currentUrl()).contains("/account");
        boolean NameVisible = actor.asksFor(Visibility.of(MiCuentaPage.BTN_IDUSUARIO));

        return TextVisible && BTNVisible && PageVisible && NameVisible;
    }
}
