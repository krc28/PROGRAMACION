package co.com.tcs.certification.android6nov.tasks;

import co.com.tcs.certification.android6nov.exceptions.ValidateElemntExceptions;
import co.com.tcs.certification.android6nov.models.UserModel;
import co.com.tcs.certification.android6nov.userinterfaces.PaymentUI;
import cucumber.api.java.af.En;
import net.bytebuddy.implementation.bind.annotation.This;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.slf4j.LoggerFactory;

import java.util.List;

public class PayNothing implements Task {
    private String name;
    private String phone;
    private String country;
    private String pay;

    public PayNothing(List<UserModel>login) {
        this.name = login.get(0).getName();
        this.phone = login.get(0).getPhone();
        this.country = login.get(0).getCountry();
        this.pay = login.get(0).getPay();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try{
            actor.attemptsTo(Click.on(PaymentUI.PAYBTN),
                    Enter.theValue(this.phone).into(PaymentUI.PHONE),
                    Enter.theValue(this.name).into(PaymentUI.NAME),
                    Enter.theValue(this.country).into(PaymentUI.COUNTRY),
                    Enter.theValue(this.pay).into(PaymentUI.AMOUNT));
        }catch (Exception err){
            err.getMessage();
            err.getCause();
            LoggerFactory.getLogger(This.class).info(ValidateElemntExceptions.MESSAGE);
        }

    }
    public static PayNothing payNothing(List<UserModel> login){
        return Tasks.instrumented(PayNothing.class, login);
    }
}
