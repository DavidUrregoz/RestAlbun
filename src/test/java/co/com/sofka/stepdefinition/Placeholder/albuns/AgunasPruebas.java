package co.com.sofka.stepdefinition.Placeholder.albuns;


import co.com.sofka.models.Datum;
import co.com.sofka.questions.ResponseCode;
import co.com.sofka.tasks.albuns.GetAlbunesCompl;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import org.junit.Test;
import org.junit.runner.RunWith;

import static co.com.sofka.questions.GetAlbunByIdUser.getAlbunByIdUser;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.notNullValue;

@RunWith(SerenityRunner.class)
public class AgunasPruebas {

    private static final String restApiUrl="https://reqres.in";
    @Test
    public void elUsuario() {

        Actor david = Actor.named("David the actor")
                .whoCan(CallAnApi.at(restApiUrl));

        david.attemptsTo(
                GetAlbunesCompl.fromPage(1)
        );

        david.should(
                seeThat("El codigo de respuesta ", ResponseCode.was(),equalTo(200))

        );

        //assertThat(SerenityRest.lastResponse().statusCode()).isEqualTo(200);

        Datum data =  getAlbunByIdUser().answeredBy(david)
                .getData().stream()
                .filter(x->x.getId()==1).findFirst()
                .orElse(null);

        david.should(
                seeThat("Usuaruo  no nulo", act -> data,notNullValue())
        );
        david.should(
                seeThat("el colo ", act -> data.getColor(),equalTo("#98B2D1"))
        );
        david.should(
                seeThat("el del nombre", act -> data.getName(),equalTo("cerulean"))
        );


        //assertThat(SerenityRest.lastResponse().;
    }


}
