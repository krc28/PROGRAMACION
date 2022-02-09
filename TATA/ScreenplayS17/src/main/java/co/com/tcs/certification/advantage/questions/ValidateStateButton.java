package co.com.tcs.certification.advantage.questions;

import co.com.tcs.certification.advantage.userinterfaces.CreateAccountPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidateStateButton implements Question {

    @Override
    public Object answeredBy(Actor actor) {

        return CreateAccountPage.BTN_REGISTER.resolveFor(actor).isEnabled();
    }

    public static ValidateStateButton register() {
        return new ValidateStateButton();
    }
}
