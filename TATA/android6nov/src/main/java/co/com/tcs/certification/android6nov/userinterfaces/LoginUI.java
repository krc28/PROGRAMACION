package co.com.tcs.certification.android6nov.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginUI {
    public static final Target USERNAME = Target.the("username")
            .located(By.id("usernameTextField"));
    public static final Target USERPWD = Target.the("userpwd")
            .located(By.id("passwordTextField"));
    public static final Target LOGIN_BUTTON = Target.the("login button")
            .located(By.id("loginButton"));

}
