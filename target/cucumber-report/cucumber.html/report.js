$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features.Placeholder/albun.feature");
formatter.feature({
  "name": "Albun de fotos",
  "description": "  Como un usuario que visita un sitio de albuns\n  nececito ingresar entrar al las carpetas especificas\n  para poder visualizar correctamente la informacion de dichos albunes",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "el usuario está en la pagina y",
  "keyword": "Given "
});
formatter.match({
  "location": "co.com.sofka.stepdefinition.Placeholder.albuns.AlbunsStepDefinition1.elUsuarioEstáEnLaPaginaY()"
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
  "name": "cuando el usuario quiere ver especificamente el algun albun",
  "keyword": "When "
});
formatter.match({
  "location": "co.com.sofka.stepdefinition.Placeholder.albuns.AlbunsStepDefinition1.cuandoElUsuarioQuiereVerEspecificamenteElAlgunAlbun()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "el usuario deberá ver el titulo del albun obtenido o la filtracion correspondiente",
  "keyword": "Then "
});
formatter.match({
  "location": "co.com.sofka.stepdefinition.Placeholder.albuns.AlbunsStepDefinition1.elUsuarioDeberáVerElTituloDelAlbunObtenidoOLaFiltracionCorrespondiente()"
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
  "name": "el usuario está en la pagina y",
  "keyword": "Given "
});
formatter.match({
  "location": "co.com.sofka.stepdefinition.Placeholder.albuns.AlbunsStepDefinition1.elUsuarioEstáEnLaPaginaY()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "get de filtrado",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "cuando el usuario haga una soicitus erronea",
  "keyword": "When "
});
formatter.match({
  "location": "co.com.sofka.stepdefinition.Placeholder.albuns.AlbunsStepDefinition1.cuandoElUsuarioHagaUnaSoicitusErronea()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "el usuario deberá ver un mensaje de error",
  "keyword": "Then "
});
formatter.match({
  "location": "co.com.sofka.stepdefinition.Placeholder.albuns.AlbunsStepDefinition1.elUsuarioDeberáVerUnMensajeDeError()"
});
formatter.result({
  "status": "passed"
});
});