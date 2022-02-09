package co.com.tcs.certification.datausa.questions;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class VerifyCodeRegister implements Question {

    @Override
    public Object answeredBy(Actor actor) {
        SerenityRest.lastResponse().prettyPrint();
        return SerenityRest.lastResponse().statusCode();
    }

    public static VerifyCodeRegister api() {
        return new VerifyCodeRegister();
    }
}
