package co.com.tcs.certification.vivaair.questions;

import co.com.tcs.certification.vivaair.userinterfaces.SelectFarePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Validateprice implements Question {

    @Override
    public Boolean answeredBy(Actor actor) {
        int firstTicketPrice = Integer.parseInt(actor.recall("firstTicketPrice").toString().replace(".", "").replace(" COP", ""));
        int firstMediumPrice = Integer.parseInt(actor.recall("firstMediumPrice").toString().replace(".", "").replace(" COP", ""));
        int secondTicketPrice = Integer.parseInt(actor.recall("secondTicketPrice").toString().replace(".", "").replace(" COP", ""));
        int secondMediumPrice = Integer.parseInt(actor.recall("secondMediumPrice").toString().replace(".", "").replace(" COP", ""));
        int expectedTotal = firstTicketPrice + (firstMediumPrice * 4) + secondTicketPrice + (secondMediumPrice * 4);
        int realTotal = Integer.parseInt(Text.of(SelectFarePage.PRICE_TOTAL).viewedBy(actor).asString().replace(".", "").replace(" COP", ""));

        return expectedTotal==realTotal;
    }

    public static Validateprice flights() {
        return new Validateprice();
    }
}
