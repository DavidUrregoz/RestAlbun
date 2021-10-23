package co.com.sofka.tasks.albuns;


import io.restassured.http.ContentType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Get;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GetAlbunesCompl implements Task {

    private final String id;

    public GetAlbunesCompl(String id) {
        this.id = id;
    }

    public static Performable fromPage(String id) {
        return instrumented(GetAlbunesCompl.class, id);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Get.resource("/albums"+id)

                        .with(requestSpecification
                                -> requestSpecification.contentType(ContentType.JSON)
                        )
        );
    }
}




