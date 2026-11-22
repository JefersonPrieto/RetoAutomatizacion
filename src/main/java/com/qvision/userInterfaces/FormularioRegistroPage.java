package com.qvision.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class FormularioRegistroPage {

    public static final Target TXT_NOMBRE = Target
            .the("aqui vamos a ingresar el nombre de usuario")
            .locatedBy("//input[@data-test='first-name']");

    public static final Target TXT_APELLIDO = Target
            .the("aqui vamos a ingresar el apellido del usuario")
            .locatedBy("//input[@data-test = 'last-name']");

    public static final Target TXT_FECHA_NACIMIENTO = Target
            .the("aqui vamos a ingresar la fecha de nacimiento del usuario")
            .locatedBy("//input[@data-test = 'dob']");

    public static final Target SLC_PAIS = Target
            .the("aqui seleccionamos el pais")
            .locatedBy("[data-test='country']");

    public static final Target TXT_CODIGO_POSTAL = Target.the("aqui vamos a ingresar el codigo postal")
            .locatedBy("[data-test='postal_code']");

    public static final Target TXT_NUMERO = Target.the("aqui vamos a ingresar el numero de casa")
            .locatedBy("[data-test='house_number']");

    public static final Target TXT_CALLE = Target.the("aqui vamos a ingresar la calle de la direccion")
            .locatedBy("[data-test='street']");

    public static final Target TXT_CIUDAD = Target.the("aqui vamos a ingresar la cuidad de la direccion")
            .locatedBy("[data-test='city']");

    public static final Target TXT_ESTADO = Target.the("aqui vamos a ingresar estado")
            .locatedBy("[data-test='state']");

    public static final Target TXT_TELEFONO = Target.the("aqui vamos a ingresar numero de telefono")
            .locatedBy("[data-test='phone']");

    public static final Target TXT_CORREO = Target.the("aqui vamos a ingresar el email del usuario")
            .locatedBy("[data-test='email']");

    public static final Target TXT_CONTRASEÑA = Target.the("aqui vamos a ingresar una contraseña del usuario")
            .locatedBy("[data-test='password']");

    public static final Target BTN_REGISTRAR = Target.the("aqui danos click en boton registrar")
            .locatedBy("[data-test='register-submit']");
}
