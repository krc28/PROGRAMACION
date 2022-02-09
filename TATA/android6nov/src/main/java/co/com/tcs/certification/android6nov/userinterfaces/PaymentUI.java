package co.com.tcs.certification.android6nov.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaymentUI {
    public static final Target PAYBTN = Target.the("pay button")
            .located(By.id("makePaymentButton"));
    public static final Target PHONE = Target.the("phone")
            .located(By.id("phoneTextField"));
    public static final Target NAME = Target.the("name")
            .located(By.id("nameTextField"));
    public static final Target COUNTRY = Target.the("country")
            .located(By.id("countryTextField"));
    public static final Target COUNTRY_BTN = Target.the("country btn")
            .located(By.id("countryButton"));
    public static final Target AMOUNT = Target.the("amount")
            .located(By.id("amount"));
    public static final Target SEND_PAY = Target.the("send pay")
            .located(By.id("sendPaymentButton"));
    public static final Target CREDIT = Target.the("credit")
            .located(By.xpath("//*[@content-desc='Your balance is: 50.00$']"));
    public static final Target NEG_CREDIT = Target.the("negative credit")
            .located(By.xpath("//*[@content-desc='Your balance is: -20.00$']"));
    public static final Target DYN_CREDIT = Target.the("payment text").
            locatedBy(("//*[contains(@content-desc,'Your balance is')]"));

}
