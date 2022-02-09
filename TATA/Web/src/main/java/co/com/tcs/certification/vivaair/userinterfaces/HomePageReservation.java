package co.com.tcs.certification.vivaair.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePageReservation {

    public static final Target INPUT_ORIGIN = Target.the("input origin")
            .located(By.id("station"));
    public static final Target INPUT_DESTINY = Target.the("input destiny")
            .located(By.id("station-second"));
    public static final Target INPUT_FINAL_DESTINY = Target.the("input final destiny")
            .located(By.id("filter-station-second"));
    public static final Target INPUT_DATA_DEPARTURE = Target.the("input data departure")
            .located(By.id("date"));
    public static final Target INPUT_DATA_ARRIVAL = Target.the("input data arrival")
            .located(By.id("dateReturn"));
    public static final Target INPUT_PASSENGER = Target.the("input passenger")
            .located(By.id("passenger"));
    public static final Target BUTTON_SEARCH = Target.the("button search")
            .located(By.xpath("//button[@class='btn-blue ibe__button__desktop ibe__button']"));
    public static final Target CITY_ORIGIN = Target.the("city origin").
            locatedBy("(//app-station[@class='station align-items-center justify-content-center'])[1]//span[.='{0}']");
    public static final Target DATE = Target.the("date").
            locatedBy("//div[@class='calendar__date_picker']//span[.='{0}']/following-sibling::span[.='{1}']//ancestor::div[@class='month']//div[contains(text(),' {2} ')]");
    public static final Target PASSENGER_ADULT = Target.the("passenger adult")
            .located(By.xpath("//div[@class='passenger__wrapper'][1]//div[.='+'][@class='action__sign']"));
    public static final Target PASSENGER_CHILD = Target.the("passenger child")
            .located(By.xpath("//div[@class='passenger__wrapper'][2]//div[.='+'][@class='action__sign']"));
    public static final Target CITIES_ORIGIN = Target.the("city origin").
            locatedBy("(//app-station[@class='station align-items-center justify-content-center'])[1]//span[.='{0}']");//app-station[@class='station align-items-center justify-content-center'][1]
}
