package co.com.tcs.certification.android6nov.questions;

import co.com.tcs.certification.android6nov.userinterfaces.PaymentUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidateSendPayBtn implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return PaymentUI.SEND_PAY.resolveFor(actor).isEnabled();
    }
    public static ValidateSendPayBtn validateSendPayBtn(){
        return new ValidateSendPayBtn();
    }
}
