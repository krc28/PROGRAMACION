package co.com.tcs.certification.advantage.tasks;

import co.com.tcs.certification.advantage.userinterfaces.CreateAccountPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

public class EntersEmail implements Task {

    private String email;

    private EntersEmail(String correo) {
        this.email = correo;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Enter.theValue(this.email + Keys.TAB).into(CreateAccountPage.FIELD_EMAIL));
        //actor.attemptsTo(Click.on(CreateAccountPage.FIELD_PASSWORD));

    }

    public static EntersEmail personal(String email) {
        return Tasks.instrumented(EntersEmail.class, email);
    }
}
