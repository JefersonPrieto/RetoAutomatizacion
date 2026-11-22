package com.qvision.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class IniciarSesionPage {

    public static final Target BTN_REGISTRAR_CUENTA =
            Target.the("Botón de link para registrar tu cuenta").
                    locatedBy("//a[@data-test='register-link']");

    public static final Target FORM_INICIO_SESION = Target
            .the("Registro de usuario Exitoso y validacion de Texto de Iniciode sesion")
            .locatedBy("//form[@data-test='login-form']");

    public static final Target TXT_CORREO_ELECTRONICO = Target
            .the("Boton para ingresar correo electronico del usuario")
            .locatedBy("//input[@data-test='email']");

    public static final Target TXT_CONTRASEÑA = Target
            .the("Boton paraingresar contraseña de usuario")
            .locatedBy("//input[@data-test='password']");

    public static final Target BTN_INICIAR_SESION = Target
            .the("Boton para iniciar sesión")
            .locatedBy("//input[@data-test='login-submit']");
}