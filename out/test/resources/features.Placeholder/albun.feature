Feature: Albun de fotos
  Como un usuario que visita un sitio de albuns
  nececito ingresar entrar al las carpetas especificas
  para poder visualizar correctamente la informacion de dichos albunes


  Background:
    Given el usuario está en la pagina y

  Scenario: get exitoso
    When cuando el usuario quiere ver especificamente el algun albun
    Then el usuario deberá ver el titulo del albun obtenido o la filtracion correspondiente

  Scenario: get de filtrado
    When cuando el usuario haga una soicitus erronea
    Then el usuario deberá ver un mensaje de error