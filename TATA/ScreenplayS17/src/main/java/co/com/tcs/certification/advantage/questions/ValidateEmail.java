package co.com.tcs.certification.advantage.questions;

import co.com.tcs.certification.advantage.userinterfaces.CreateAccountPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.tcs.certification.advantage.userinterfaces.CreateAccountPage.*;

public class ValidateEmail implements Question {

    @Override
    public Object answeredBy(Actor actor) {

        WaitUntil.the(MSG_EMAIL, WebElementStateMatchers.isVisible()).forNoMoreThan(5).seconds();
        //return CreateAccountPage.MSG_EMAIL.resolveFor(actor).getText();
        return Text.of(MSG_EMAIL).viewedBy(actor).asString();
    }

    public static ValidateEmail message() {
        return new ValidateEmail();
    }
}
