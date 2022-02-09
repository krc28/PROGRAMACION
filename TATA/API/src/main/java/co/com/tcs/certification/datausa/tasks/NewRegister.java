package co.com.tcs.certification.datausa.tasks;

import co.com.tcs.certification.datausa.models.RegisterInformation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Post;

import java.util.List;

import static co.com.tcs.certification.datausa.utils.Constants.PARAMETER;
import static co.com.tcs.certification.datausa.utils.Constants.PATH;

public class NewRegister implements Task {

    private List<RegisterInformation> newData;

    public NewRegister(List<RegisterInformation> newData) {
        this.newData = newData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Post.to(PATH+ PARAMETER).with(requestSpecification -> requestSpecification.headers("Content-Type","application/json").
                body(newData.get(0)).log().all()));
    }

    public static NewRegister api(List<RegisterInformation> newData) {
        return Tasks.instrumented(NewRegister.class, newData);
    }
}
