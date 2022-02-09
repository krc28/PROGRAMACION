package co.com.tcs.certification.vivaair.tasks;

import co.com.tcs.certification.vivaair.userinterfaces.HomePageReservation;
import co.com.tcs.certification.vivaair.userinterfaces.SelectFarePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.util.Map;
import static co.com.tcs.certification.vivaair.userinterfaces.HomePageReservation.*;

public class ModifyData implements Task {

    private Map<String, String> data;

    public ModifyData(Map<String, String> data) {
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.remember("firstText", Text.of(SelectFarePage.TEXT_MODIFY).viewedBy(actor).asString());
        actor.attemptsTo(Click.on(SelectFarePage.BUTTON_MODIFY),
                Click.on(CITY_ORIGIN),
                WaitUntil.the(CITY_ORIGIN.of(data.get("originCity")), WebElementStateMatchers.isClickable()).forNoMoreThan(60).seconds(),
                Click.on(CITY_ORIGIN.of(data.get("originCity"))),
                Enter.theValue(data.get("destinyCity")).into(INPUT_FINAL_DESTINY).thenHit(Keys.ENTER),
                WaitUntil.the(DATE.of(data.get("departureMonth")
                        ,data.get("departureYear")
                        ,data.get("departureDay")), WebElementStateMatchers.isPresent()).forNoMoreThan(60).seconds());

        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",DATE.of(data.get("departureMonth")
                        ,data.get("departureYear")
                        ,data.get("departureDay"))
                .resolveFor(actor));
        js.executeScript("arguments[0].click();",DATE.of(data.get("arrivalMonth")
                        ,data.get("arrivalYear")
                        ,data.get("arrivalDay"))
                .resolveFor(actor));
        actor.attemptsTo(Click.on(INPUT_PASSENGER));
        for (int i = 0; i < Integer.parseInt(data.get("adults"))-1 ; i++) {
            actor.attemptsTo(Click.on(PASSENGER_ADULT));
        }
        for (int i = 0; i < Integer.parseInt(data.get("child")) ; i++) {
            actor.attemptsTo(Click.on(PASSENGER_CHILD));
        }
        actor.attemptsTo(Click.on(BUTTON_SEARCH));
    }

    public static ModifyData flight(Map<String, String> data) {
        return Tasks.instrumented(ModifyData.class, data);
    }
}
