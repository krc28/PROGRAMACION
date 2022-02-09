package co.com.tcs.certification.datausa.questions;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class VerifyIdYear implements Question {

    @Override
    public Object answeredBy(Actor actor) {
        return SerenityRest.lastResponse().jsonPath().get("data[0].\"ID Year\"");
    }

    public static VerifyIdYear api(){
        return new VerifyIdYear();
    }
}
