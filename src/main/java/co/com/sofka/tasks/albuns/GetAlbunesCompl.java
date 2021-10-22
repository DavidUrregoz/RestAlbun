package co.com.sofka.tasks.albuns;


import io.restassured.http.ContentType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Get;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GetAlbunesCompl implements Task {

    private final int page;

    public GetAlbunesCompl(int page) {
        this.page = page;
    }

    public static Performable fromPage(int page) {
        return instrumented(GetAlbunesCompl.class, page);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Get.resource("/api/unknown")

                        .with(requestSpecification
                                -> requestSpecification.contentType(ContentType.JSON)
                        )
        );
    }
}




