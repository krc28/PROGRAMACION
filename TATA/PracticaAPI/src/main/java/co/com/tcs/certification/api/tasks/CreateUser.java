package co.com.tcs.certification.api.tasks;

import co.com.tcs.certification.api.utils.Constants;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Post;

import java.util.List;

public class CreateUser implements Task {

    private List<String> register;

    public CreateUser(List<String> register) {
        this.register = register;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Post.to(Constants.RESOURCE).with(requestSpecification -> requestSpecification.
                body("{'name': '"+ this.register.get(0)+"','job': '"+ this.register.get(1)+"'}")));

    }

    public static CreateUser user(List<String> register) {
        return Tasks.instrumented(CreateUser.class, register);
    }
}
