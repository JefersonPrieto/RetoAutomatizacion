package com.qvision.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class IniciarSesionPage {

    public static final Target BTN_REGISTRAR_CUENTA =
            Target.the("Botón de link para registrar tu cuenta").
                    locatedBy("//a[@data-test='register-link']");
}
