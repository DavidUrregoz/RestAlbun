package co.com.sofka.stepdefinition.Placeholder.albuns;

import co.com.sofka.models.Albun;
import co.com.sofka.questions.ResponseCode;
import co.com.sofka.tasks.albuns.GetAlbunesCompl;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;


import static co.com.sofka.questions.GetAlbunByIdUser.getAlbunByIdUser;
import static co.com.sofka.util.Title.TITLE1;
import static co.com.sofka.util.Title.TITLE6;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.notNullValue;
import static javax.servlet.http.HttpServletResponse.SC_OK;
import static javax.servlet.http.HttpServletResponse.SC_NOT_FOUND;

public class AlbunsStepDefinition1  {

    private static final String restApiUrl="https://jsonplaceholder.typicode.com";
    Actor david ;
    Albun data ;
    Albun data2;

    @Given("el usuario está en la pagina y")
    public void elUsuarioEstáEnLaPaginaY() {
        david = Actor.named("David the actor")
                .whoCan(CallAnApi.at(restApiUrl));

        david.attemptsTo(
                GetAlbunesCompl.fromPage("")
        );
        david.should(
                seeThat("El codigo de respuesta ", ResponseCode.was(),equalTo(SC_OK))
        );
    }

    @When("cuando el usuario quiere ver especificamente el algun albun")
    public void cuandoElUsuarioQuiereVerEspecificamenteElAlgunAlbun() {
        data =  getAlbunByIdUser().answeredBy(david)
                .getData().stream()
                .filter(x->x.getId()==1).findFirst()
                .orElse(null);

        data2 = getAlbunByIdUser().answeredBy(david)
                .getData().stream()
                .filter(x->x.getUserId()==6).findFirst()
                .orElse(null);
        david.should(
                seeThat("Usuaruo  no nulo", act -> data,notNullValue())
        );
    }

    @Then("el usuario deberá ver el titulo del albun obtenido o la filtracion correspondiente")
    public void elUsuarioDeberáVerElTituloDelAlbunObtenidoOLaFiltracionCorrespondiente() {
        david.should(
                seeThat("el primer titulo del primer usuario ", act -> data.getTitle(),equalTo(TITLE1.getValue()))
        );
        david.should(
                seeThat("el primer titulo del usuario 6 " ,act->data2.getTitle(),equalTo(TITLE6.getValue()))
        );
    }

    @When("cuando el usuario haga una soicitus erronea")
    public void cuandoElUsuarioHagaUnaSoicitusErronea() {
        Actor david = Actor.named("David the actor")
                .whoCan(CallAnApi.at(restApiUrl));
        david.attemptsTo(
                GetAlbunesCompl.fromPage("21")//Formato no existente
        );
    }

    @Then("el usuario deberá ver un mensaje de error")
    public void elUsuarioDeberáVerUnMensajeDeError() {
        david.should(
                seeThat("El codigo de respuesta ", ResponseCode.was(),equalTo(SC_NOT_FOUND))

        );
    }

}
