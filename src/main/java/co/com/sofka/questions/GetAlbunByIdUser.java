package co.com.sofka.questions;



import co.com.sofka.models.Albun;
import co.com.sofka.models.Albuns;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;


import java.util.Arrays;
import java.util.List;

import static net.serenitybdd.rest.SerenityRest.lastResponse;


public class GetAlbunByIdUser implements Question {
    @Override
    public Albuns answeredBy(Actor actor) {
        List<Albun> listaAlbunes = Arrays.asList(lastResponse().getBody().as(Albun[].class));
        Albuns albuns = new Albuns();
        albuns.setAlbuns(listaAlbunes);
        return albuns;
    }

    public static GetAlbunByIdUser getAlbunByIdUser() {
        return new GetAlbunByIdUser();
    }
}
