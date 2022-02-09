package co.com.tcs.certification.api.tasks;

import co.com.tcs.certification.api.utils.Constants;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Get;

import static co.com.tcs.certification.api.utils.Constants.*;

public class ConsultInfo implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Get.resource(RESOURCE).with(requestSpecification -> requestSpecification.
                param("page","2").
                param("id","9").log().all()));
    }

    public static ConsultInfo api() {
        return Tasks.instrumented(ConsultInfo.class);
    }
}
