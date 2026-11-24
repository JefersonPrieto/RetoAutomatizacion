# language: es
Característica: Como usuario quiero intentar iniciar sesion
                con credenciales que no estan registradas previamente
                y validar el mensaje de rechazo de datos invalidos


  Escenario: Inicio de sesion con credenciales invalidas

    Dado que ingreso a la pagina de iniciar sesion
    Cuando ingreso credenciales invalidas de inicio de sesion
    Entonces valido el mensaje de inicio de sesion fallido
