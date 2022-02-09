package co.com.tcs.certification.android6nov.questions;

import co.com.tcs.certification.android6nov.userinterfaces.LoginUI;
import co.com.tcs.certification.android6nov.userinterfaces.PaymentUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class WatchMessage implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return PaymentUI.PAYBTN.resolveFor(actor).isPresent();
    }
    public static WatchMessage watchMessage(){
        return new WatchMessage();
    }
}
