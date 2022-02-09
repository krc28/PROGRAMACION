package co.com.tcs.certification.vivaair.questions;
import co.com.tcs.certification.vivaair.userinterfaces.HomePageReservation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;



public class Validatedata implements Question {

    @Override
    public Boolean answeredBy(Actor actor) {
        return HomePageReservation.INPUT_ORIGIN.resolveFor(actor).isCurrentlyVisible() &&
                HomePageReservation.INPUT_DESTINY.resolveFor(actor).isCurrentlyVisible() &&
                HomePageReservation.INPUT_DATA_DEPARTURE.resolveFor(actor).isCurrentlyVisible() &&
                HomePageReservation.INPUT_DATA_ARRIVAL.resolveFor(actor).isCurrentlyVisible() &&
                HomePageReservation.INPUT_PASSENGER.resolveFor(actor).isCurrentlyVisible() &&
                HomePageReservation.BUTTON_SEARCH.resolveFor(actor).isCurrentlyVisible();
    }

    public static Validatedata home() {
        return new Validatedata();
    }
}
