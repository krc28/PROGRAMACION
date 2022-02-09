package co.com.tcs.certification.api.questions;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class VerifyCode implements Question
{
    @Override
    public Object answeredBy(Actor actor)
    {
        //System.out.println(SerenityRest.lastResponse().statusCode());
        //System.out.println(SerenityRest.lastResponse().jsonPath().prettyPrint());
        //System.out.println(SerenityRest.lastResponse().jsonPath().getString("data.first_name"));


        return SerenityRest.lastResponse().statusCode();
        //return SerenityRest.lastResponse().jsonPath().getString("data.first_name");
    }

    public static VerifyCode response()
    {
        return new VerifyCode();
    }
}
