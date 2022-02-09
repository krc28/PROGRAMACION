package co.com.tcs.certification.vivaair.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SelectFarePage {

    public static final Target SELECT_FARE = Target.the("select fare")
            .located(By.xpath("//app-flight[@class='flight'][1]/div[1]"));
    public static final Target PRICE_TICKET_FARE = Target.the("price ticket fare")
            .located(By.xpath("//app-flight[@class='flight'][1]/div[1]//span[@class='lowest-fare__price']"));
    public static final Target PRICE_MEDIUM_FARE = Target.the("price medium fare")
            .located(By.xpath("//div[.='Tarifa Medium']//ancestor::app-fare[@class='fare fare--selected']//span[@class='price__value']"));
    public static final Target CONTINUE_BUTTON = Target.the("continue button")
            .located(By.id("booking-continue-btn"));
    public static final Target PRICE_TOTAL = Target.the("price total")
            .located(By.xpath("//h6[@class='section__price booking-total']"));
    public static final Target BUTTON_MODIFY = Target.the("button modify")
            .located(By.xpath("//button[@class='basket__edit-search-btn']"));
    public static final Target TEXT_MODIFY = Target.the("text modify")
            .located(By.xpath("//h4[@class='route__text']"));




}
