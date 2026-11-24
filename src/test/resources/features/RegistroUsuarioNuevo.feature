# language: es
Característica: Registro de usuario nuevo
    Como usuario de ToolShop
    Quiero registrarme en la página
    Para iniciar sesion con mi usuario recien creado

    Escenario: Registrar usuario nuevo

        Dado que ingreso al formulario de registro de usuario
        Y completo los datos del formulario y creo el nuevo usuario
        Cuando inicio sesión con el nuevo usuario recién creado
        Entonces ingreso exitosamente al perfil
