package co.com.tcs.certification.datausa.tasks;

import co.com.tcs.certification.datausa.utils.Constants;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Get;

import java.util.Map;

public class EnterParameter implements Task {

    private Map<String,String> param;

    public EnterParameter(Map<String,String>param) {
        this.param = param;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Get.resource(Constants.PATH).with(requestSpecification -> requestSpecification.
                params(param)));
    }

    public static EnterParameter api(Map<String,String> param) {
        return Tasks.instrumented(EnterParameter.class, param);
    }
}
