package co.com.tcs.certification.advantage.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CreateAccountPage {

    public static final Target FIELD_USERNAME = Target.the("username field").
            located(By.name("usernameRegisterPage"));

    public static final Target FIELD_EMAIL = Target.the("field email").
            located(By.name("emailRegisterPage"));

    public static final Target FIELD_PASSWORD = Target.the("field password").
            located(By.name("passwordRegisterPage"));

    public static final Target FIELD_CONFIRM_PASSWORD = Target.the("field confirm password").
            located(By.name("confirm_passwordRegisterPage"));

    public static final Target FIELD_FIRSTNAME = Target.the("field firstname").
            located(By.name("first_nameRegisterPage"));

    public static final Target FIELD_LASTNAME = Target.the("field lastname").
            located(By.name("last_nameRegisterPage"));

    public static final Target FIELD_PHONE = Target.the("field phone").
            located(By.name("phone_numberRegisterPage"));

    public static final Target SLC_COUNTRY = Target.the("field country").
            located(By.name("countryListboxRegisterPage"));

    public static final Target FIELD_CITY = Target.the("field city").
            located(By.name("cityRegisterPage"));

    public static final Target FIELD_ADDRESS = Target.the("field address").
            located(By.name("addressRegisterPage"));

    public static final Target FIELD_REGION = Target.the("field region").
            located(By.name("state_/_province_/_regionRegisterPage"));

    public static final Target FIELD_CODE = Target.the("field code").
            located(By.name("postal_codeRegisterPage"));

    public static final Target CHK_OFFERS = Target.the("check for offers").
            located(By.name("allowOffersPromotion"));

    public static final Target CHK_CONDITIONS = Target.the("check for conditions").
            located(By.name("i_agree"));

    public static final Target BTN_REGISTER = Target.the("button register").
            located(By.id("register_btnundefined"));

    public static final Target SLC_COLOMBIA = Target.the("select country colombia").
            located(By.xpath("//option[contains(text(),'Colombia')]"));

    public static final Target MSG_EMAIL = Target.the("email message").
            located(By.xpath("(//label[contains(@class,'invalid')])[2]"));

}
