package co.com.sofka.stepdefinition.Placeholder.albuns;

import co.com.sofka.models.Datum;
import co.com.sofka.questions.ResponseCode;
import co.com.sofka.tasks.albuns.GetAlbunesCompl;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import org.junit.runner.RunWith;

import static co.com.sofka.questions.GetAlbunByIdUser.getAlbunByIdUser;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.notNullValue;

//@RunWith(CucumberWithSerenity.class)
public class AlbunsStepDefinition1  {

    private static final String restApiUrl="https://reqres.in";
    Actor david ;
    Datum data ;
    Datum data2;
    @Given("que el usuario tiene conexion  a un navegador")
    public void que_el_usuario_tiene_conexion_a_un_navegador() {
        david = Actor.named("David the actor")
                .whoCan(CallAnApi.at(restApiUrl));

        david.attemptsTo(
                GetAlbunesCompl.fromPage(1)
        );
        david.should(
                seeThat("El codigo de respuesta ", ResponseCode.was(),equalTo(200))
        );
    }

    //CORRECTO

    @When("cuando el usuario realiza correctamente la peticion del servicio")
    public void cuando_el_usuario_realiza_correctamente_la_peticion_del_servicio() {
         data =  getAlbunByIdUser().answeredBy(david)
                .getData().stream()
                .filter(x->x.getId()==1).findFirst()
                .orElse(null);
         data2 = getAlbunByIdUser().answeredBy(david)
                         .getData().stream()
                         .filter(x->x.getId()==6).findFirst()
                         .orElse(null);
        david.should(
                seeThat("Usuaruo  no nulo", act -> data,notNullValue())
        );
    }

    @Then("el usuario deberá observar obtener correctamente la lista con los colores disponibles")
    public void el_usuario_deberá_observar_obtener_correctamente_la_lista_con_los_colores_disponibles() {
        david.should(
                seeThat("el primer color de la lsita ", act -> data.getColor(),equalTo("#98B2D1"))
        );
        david.should(
                seeThat("el primer nombre nombre de la lista", act -> data.getName(),equalTo("cerulean"))
        );
        david.should(
                seeThat("el ultimo color de la lista es " ,act->data2.getColor(),equalTo("#53B0AE"))
        );
        david.should(
                seeThat("el ultimo nombre de la lista es " ,act->data2.getName(),equalTo("blue turquoise"))
        );

    }

    //FALLIDO
    @When("cuando el usuario realice mal la peticion")
    public void cuando_el_usuario_realice_mal_la_peticion() {

    }

    @Then("el servicio debew retornar un mensaje de error 404Not Found")
    public void el_servicio_debew_retornar_un_mensaje_de_error_404Not_Found() {

    }


}
