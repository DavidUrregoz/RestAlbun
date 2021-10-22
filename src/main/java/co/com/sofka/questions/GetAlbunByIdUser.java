package co.com.sofka.questions;


import co.com.sofka.models.Users;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;


public class GetAlbunByIdUser implements Question {
    @Override
    public Users answeredBy(Actor actor) {
        return SerenityRest.lastResponse().as(Users.class);
    }
    public static GetAlbunByIdUser getAlbunByIdUser(){
        return new GetAlbunByIdUser();
    }
}
