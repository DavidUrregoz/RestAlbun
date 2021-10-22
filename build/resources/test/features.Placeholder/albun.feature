Feature: Albun de fotos
  Como un usuario que visita un sitio de albuns
  nececito ingresar entrar al las carpetas especificas
  para poder visualizar correctamente la informacion de dichos albunes


  Background:
    Given el usuario está en la pagina y

  Scenario: get exitoso
    When cuando el usuario quiere ver especificamente el albun "1" el Usuario  "1"
    Then el usuario deberá ver el titulo del albun obtenido o la filtracion correspondiente

  Scenario: get de filtrado
    When cuando el usuario quiere ver todos los albunes del Usuario  "2"
    Then el usuario deberá ver una lista con todos los titulos y los id del usuario