Feature: Catalogo de Colores
  Como un usuario que necesita que desea comprar una pintura
  nececita obtener la lista de colores
  para poder visualizar correctamente y comprar alguno de ellos


  Background:
    Given que el usuario tiene conexion  a un navegador

  Scenario: get exitoso
    When cuando el usuario realiza correctamente la peticion del servicio
    Then el usuario deberá observar obtener correctamente la lista con los colores disponibles

  Scenario: get fallido
    When cuando el usuario realice mal la peticion
    Then el servicio debew retornar un mensaje de error 404Not Found