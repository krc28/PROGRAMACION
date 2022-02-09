package co.com.tcs.certification.android6nov.tasks;

import co.com.tcs.certification.android6nov.models.UserModel;
import co.com.tcs.certification.android6nov.userinterfaces.LoginUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class EnterCredentials implements Task {
    private String user;
    private String pwd;
    //private List<String> login;

    public EnterCredentials(List<UserModel>login) {
        //this.login = login;
        this.user = login.get(0).getUser();
        this.pwd = login.get(0).getPwd();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(this.user).into(LoginUI.USERNAME),
                Enter.theValue(this.pwd).into(LoginUI.USERPWD),
                Click.on(LoginUI.LOGIN_BUTTON));
    }
    public static EnterCredentials enterCredentials(List<UserModel> login){
        return Tasks.instrumented(EnterCredentials.class, login);
    }
}
