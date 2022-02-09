package co.com.tcs.certification.advantage.tasks;

import co.com.tcs.certification.advantage.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class AccessForm implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(HomePage.BTN_LOGIN));
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
      /* WaitUntil.the(HomePage.LOADER,WebElementStateMatchers.isNotVisible()).forNoMoreThan(30).seconds();
       WaitUntil.the(HomePage.LOADER,WebElementStateMatchers.isNotPresent()).forNoMoreThan(30).seconds();
       WaitUntil.the(HomePage.LOADER2,WebElementStateMatchers.isEnabled()).forNoMoreThan(30).seconds();
       WaitUntil.the(HomePage.BTN_CREATE_ACCOUNT,WebElementStateMatchers.isClickable()).forNoMoreThan(30).seconds();*/
        actor.attemptsTo(Click.on(HomePage.BTN_CREATE_ACCOUNT));
    }

    public static AccessForm register() {
        return Tasks.instrumented(AccessForm.class);
    }

}
