package co.com.tcs.certification.vivaair.tasks;

import co.com.tcs.certification.vivaair.userinterfaces.SelectFarePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;



public class SelectFare implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(WaitUntil.the(SelectFarePage.SELECT_FARE, WebElementStateMatchers.isClickable()).forNoMoreThan(60).seconds(),
                Click.on(SelectFarePage.SELECT_FARE));
        actor.remember("firstTicketPrice", Text.of(SelectFarePage.PRICE_TICKET_FARE).viewedBy(actor).asString());
        actor.remember("firstMediumPrice", Text.of(SelectFarePage.PRICE_MEDIUM_FARE).viewedBy(actor).asString());
        actor.attemptsTo(WaitUntil.the(SelectFarePage.CONTINUE_BUTTON, WebElementStateMatchers.isCurrentlyVisible()).forNoMoreThan(60).seconds(),
                Click.on(SelectFarePage.CONTINUE_BUTTON),
                WaitUntil.the(SelectFarePage.SELECT_FARE, WebElementStateMatchers.isClickable()).forNoMoreThan(60).seconds(),
                Click.on(SelectFarePage.SELECT_FARE));
        actor.remember("secondTicketPrice", Text.of(SelectFarePage.PRICE_TICKET_FARE).viewedBy(actor).asString());
        actor.remember("secondMediumPrice", Text.of(SelectFarePage.PRICE_MEDIUM_FARE).viewedBy(actor).asString());
        actor.attemptsTo(WaitUntil.the(SelectFarePage.CONTINUE_BUTTON, WebElementStateMatchers.isCurrentlyVisible()).forNoMoreThan(60).seconds(),
                Click.on(SelectFarePage.CONTINUE_BUTTON));

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static SelectFare cheapest() {
        return Tasks.instrumented(SelectFare.class);
    }
}
