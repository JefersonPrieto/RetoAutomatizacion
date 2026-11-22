package com.qvision.questions;

import com.qvision.userInterfaces.IniciarSesionPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;
import net.serenitybdd.screenplay.questions.page.TheWebPage;

public class FormularioInicioSesion implements Question<Boolean> {

    public static FormularioInicioSesion estaVisible(){
        return new FormularioInicioSesion();
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        boolean formVisible = actor.asksFor(Visibility.of(IniciarSesionPage.FORM_INICIO_SESION));
        boolean pageVisible = actor.asksFor(TheWebPage.currentUrl()).contains("/login");

        return formVisible && pageVisible;
    }

}
