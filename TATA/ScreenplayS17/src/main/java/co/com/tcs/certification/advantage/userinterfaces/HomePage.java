package co.com.tcs.certification.advantage.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {

    public static final Target BTN_LOGIN = Target.the("login button").
            located(By.id("menuUserLink"));

    public static final Target BTN_CREATE_ACCOUNT = Target.the("create account button").
            located(By.xpath("//a[@class='create-new-account ng-scope']"));


    public static final Target LOADER = Target.the("create account button").
            located(By.xpath("//div[@class='PopUp']//div//div[@class='loader']"));

    public static final Target LOADER2 = Target.the("create account button").
            located(By.xpath("//span[@class='facebook ng-scope']"));

    public static final Target CHK_REMEMBER = Target.the("check rememberme").
            located(By.name("remember_me"));


}
