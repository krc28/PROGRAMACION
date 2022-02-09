package co.com.tcs.certification.android6nov.tasks;

import co.com.tcs.certification.android6nov.models.UserModel;
import co.com.tcs.certification.android6nov.userinterfaces.PaymentUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class PayOutOfMoney implements Task {
    private String name;
    private String phone;
    private String country;
    private String pay;

    public PayOutOfMoney(List<UserModel> login) {
        this.name = login.get(0).getName();
        this.phone = login.get(0).getPhone();
        this.country = login.get(0).getCountry();
        this.pay = login.get(0).getPay();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PaymentUI.PAYBTN),
                Enter.theValue(this.phone).into(PaymentUI.PHONE),
                Enter.theValue(this.name).into(PaymentUI.NAME),
                Enter.theValue(this.country).into(PaymentUI.COUNTRY),
                Enter.theValue(this.pay).into(PaymentUI.AMOUNT),
                Click.on(PaymentUI.SEND_PAY));
        BrowseTheWeb.as(actor).getAlert().accept();
    }
    public static PayOutOfMoney payOutOfMoney(List<UserModel> pay){
        return Tasks.instrumented(PayOutOfMoney.class, pay);
    }
}
