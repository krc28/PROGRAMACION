package co.com.tcs.certification.android6nov.questions;

import co.com.tcs.certification.android6nov.userinterfaces.PaymentUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidateNegCred implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return PaymentUI.NEG_CREDIT.resolveFor(actor).getAttribute("content-desc");
    }
    public static ValidateNegCred validateNegCred(String negCrdt){
        return new ValidateNegCred();
    }
}
