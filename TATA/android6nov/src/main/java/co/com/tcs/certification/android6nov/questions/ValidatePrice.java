package co.com.tcs.certification.android6nov.questions;

import co.com.tcs.certification.android6nov.userinterfaces.PaymentUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.questions.Text;

public class ValidatePrice implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return PaymentUI.DYN_CREDIT.resolveFor(actor).getAttribute("content-desc");
    }
    public static ValidatePrice validatePrice(){
        return new ValidatePrice();
    }
}
