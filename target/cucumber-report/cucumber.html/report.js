$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features.Placeholder/albunColors.feature");
formatter.feature({
  "name": "Catalogo de Colores",
  "description": "  Como un usuario que necesita que desea comprar una pintura\n  nececita obtener la lista de colores\n  para poder visualizar correctamente y comprar alguno de ellos",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "que el usuario tiene conexion  a un navegador",
  "keyword": "Given "
});
formatter.match({
  "location": "co.com.sofka.stepdefinition.Placeholder.albuns.AlbunsStepDefinition1.que_el_usuario_tiene_conexion_a_un_navegador()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "get exitoso",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "cuando el usuario realiza correctamente la peticion del servicio",
  "keyword": "When "
});
formatter.match({
  "location": "co.com.sofka.stepdefinition.Placeholder.albuns.AlbunsStepDefinition1.cuando_el_usuario_realiza_correctamente_la_peticion_del_servicio()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "el usuario deberá observar obtener correctamente la lista con los colores disponibles",
  "keyword": "Then "
});
formatter.match({
  "location": "co.com.sofka.stepdefinition.Placeholder.albuns.AlbunsStepDefinition1.el_usuario_deberá_observar_obtener_correctamente_la_lista_con_los_colores_disponibles()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "que el usuario tiene conexion  a un navegador",
  "keyword": "Given "
});
formatter.match({
  "location": "co.com.sofka.stepdefinition.Placeholder.albuns.AlbunsStepDefinition1.que_el_usuario_tiene_conexion_a_un_navegador()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "get fallido",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "cuando el usuario realice mal la peticion",
  "keyword": "When "
});
formatter.match({
  "location": "co.com.sofka.stepdefinition.Placeholder.albuns.AlbunsStepDefinition1.cuando_el_usuario_realice_mal_la_peticion()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "el servicio debew retornar un mensaje de error 404Not Found",
  "keyword": "Then "
});
formatter.match({
  "location": "co.com.sofka.stepdefinition.Placeholder.albuns.AlbunsStepDefinition1.el_servicio_debew_retornar_un_mensaje_de_error_404Not_Found()"
});
formatter.result({
  "status": "passed"
});
});