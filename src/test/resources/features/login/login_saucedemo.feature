# language: es
Característica: Inicio de sesión en la página Swag Labs.
  Yo, como usuario
  Necesito iniciar sesión con usuario y contraseña
  Para poder ingresar a la página Swag Labs,

Antecedentes:
 Dado que se ingresó a la página de www.saucedemo.com
 Y que se valida que se cargue los elementos para realizar el login

  Esquema del escenario: Iniciar sesión con campos vacios
    Cuando en el campo Username ingreso <user>
    Y en el campo Password ingreso <password>
    Y envío la solicitud
    Entonces se muestra el mensaje <message>

    Ejemplos:
      | user            | password     | message              |
      | empty           | secret_sauce | Username is required |
      | standard_user   | empty        | Password is required |
      | empty           | empty        | Username is required |

  Esquema del escenario: Iniciar sesión con credenciales incorrectas
    Cuando en el campo Username ingreso <user>
    Y en el campo Password ingreso <password>
    Y envío la solicitud
    Entonces se muestra el mensaje <message>

    Ejemplos:
      | user            | password        | message                                                     |
      | user_test18     | secret_sauce    | Username and password do not match any user in this service |

  Esquema del escenario: Iniciar sesión con usuario bloqueado
    Cuando en el campo Username ingreso <user>
    Y en el campo Password ingreso <password>
    Y envío la solicitud
    Entonces se muestra el mensaje <message>

    Ejemplos:
      | user            | password     | message                               |
      | locked_out_user | secret_sauce | Sorry, this user has been locked out. |

  Esquema del escenario: Iniciar sesión exitosamente
    Cuando en el campo Username ingreso <user>
    Y en el campo Password ingreso <password>
    Y envío la solicitud
   Entonces permite el ingreso

    Ejemplos:
      | user           | password     |
      | standard_user  | secret_sauce |