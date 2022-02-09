package co.com.tcs.certification.advantage.tasks;

import static co.com.tcs.certification.advantage.userinterfaces.CreateAccountPage.*;

import co.com.tcs.certification.advantage.models.PersonalInformation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;


public class EntersInformation implements Task {

    private String username;
    private String email;
    private String password;
    private String confirmPassword;
    private String firstName;
    private String lastName;
    private String phone;
    private String country;
    private String city;
    private String address;
    private String region;
    private String code;

    public EntersInformation(List<PersonalInformation> data) {
        this.username = data.get(0).getUsername();
        this.email = data.get(0).getEmail();
        this.password = data.get(0).getPassword();
        this.confirmPassword = data.get(0).getConfirmPassword();
        this.firstName = data.get(0).getFirstName();
        this.lastName = data.get(0).getLastName();
        this.phone = data.get(0).getPhone();
        this.country = data.get(0).getCountry();
        this.city = data.get(0).getCity();
        this.address = data.get(0).getAddress();
        this.region = data.get(0).getRegion();
        this.code = data.get(0).getCode();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(this.username).into(FIELD_USERNAME));
        actor.attemptsTo(Enter.theValue(this.email).into(FIELD_EMAIL));
        actor.attemptsTo(Enter.theValue(this.password).into(FIELD_PASSWORD));
        actor.attemptsTo(Enter.theValue(this.confirmPassword).into(FIELD_CONFIRM_PASSWORD));
        actor.attemptsTo(Enter.theValue(this.firstName).into(FIELD_FIRSTNAME));
        actor.attemptsTo(Enter.theValue(this.lastName).into(FIELD_LASTNAME));
        actor.attemptsTo(Enter.theValue(this.phone).into(FIELD_PHONE));
        actor.attemptsTo(SelectFromOptions.byVisibleText(this.country).from(SLC_COUNTRY));
        List<String> elementos = SLC_COUNTRY.resolveFor(actor).getSelectOptions();
        System.out.println(elementos.get(5));
        System.out.println(SLC_COUNTRY.resolveFor(actor).containsText("Colombia"));
        System.out.println(SLC_COUNTRY.resolveFor(actor).getSelectedVisibleTextValue());
        actor.attemptsTo(Enter.theValue(this.city).into(FIELD_CITY));
        actor.attemptsTo(Enter.theValue(this.address).into(FIELD_ADDRESS));
        actor.attemptsTo(Enter.theValue(this.region).into(FIELD_REGION));
        actor.attemptsTo(Enter.theValue(this.code).into(FIELD_CODE));
        actor.attemptsTo(Click.on(CHK_CONDITIONS));
    }

    public static EntersInformation personal(List<PersonalInformation> data) {
        return Tasks.instrumented(EntersInformation.class, data);
    }

}
