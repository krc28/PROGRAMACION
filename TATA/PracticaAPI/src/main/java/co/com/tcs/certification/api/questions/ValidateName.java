package co.com.tcs.certification.api.questions;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidateName implements Question
{
    @Override
    public Object answeredBy(Actor actor) {
        //nombre = SerenityRest.lastResponse().jsonPath().getString("data.first_name");
        //apellido = SerenityRest.lastResponse().jsonPath().getString("data.last_name");
        return SerenityRest.lastResponse().jsonPath().getString("data.first_name");
    }

    public static ValidateName name(){
        return new ValidateName();
    }
}
