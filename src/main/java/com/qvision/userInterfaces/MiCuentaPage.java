package com.qvision.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class MiCuentaPage {

    public static final Target TXT_MICUENTA =
            Target.the("Texto visual Mi Cuenta").
                    locatedBy("//h1[@data-test='page-title']");
    public static final Target BTN_PERFIL   =
            Target.the("Boton Visible Perfil").
                    locatedBy("//a[@data-test='nav-profile']");
    public static final Target BTN_IDUSUARIO =
            Target.the("Boton identificador del ID usuario").
                    locatedBy("//button[@data-test='nav-menu']");


}
