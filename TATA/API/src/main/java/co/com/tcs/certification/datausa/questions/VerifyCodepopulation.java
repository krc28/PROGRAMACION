package co.com.tcs.certification.datausa.questions;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class VerifyCodepopulation implements Question {



    @Override
    public Object answeredBy(Actor actor) {
        return SerenityRest.lastResponse().jsonPath().get("data[0].Population");
    }

    public static VerifyCodepopulation api(){
        return new VerifyCodepopulation();
    }
}
