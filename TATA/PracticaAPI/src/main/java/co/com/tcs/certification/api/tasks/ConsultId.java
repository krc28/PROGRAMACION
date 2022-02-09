package co.com.tcs.certification.api.tasks;

import co.com.tcs.certification.api.utils.Constants;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Get;

public class ConsultId implements Task
{
    private String id;

    public ConsultId(String id) {
        this.id = id;
    }

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo(Get.resource(Constants.RESOURCE).with(requestSpecification -> requestSpecification.
                param("id",this.id)));
    }

    public static ConsultId user(String id)
    {
        return Tasks.instrumented(ConsultId.class,id);
    }
}
