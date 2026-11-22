package com.qvision.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class NavBarPage {

    public static final Target BTN_INICIAR_SESION =
            Target.the("Botón de iniciar sesión").
                    locatedBy("//a[@data-test='nav-sign-in']");
}
