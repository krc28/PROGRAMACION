package co.com.tcs.certification.vivaair.questions;

import co.com.tcs.certification.vivaair.userinterfaces.SelectFarePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidateModify implements Question {

    @Override
    public Boolean answeredBy(Actor actor) {
        String firstText = Text.of(SelectFarePage.TEXT_MODIFY).viewedBy(actor).asString();
        String textPage = Text.of(SelectFarePage.TEXT_MODIFY).viewedBy(actor).asString();
        System.out.println(firstText);
        System.out.println(textPage);
        return firstText.equals(textPage);
    }

    public static ValidateModify text() {
        return new ValidateModify();
    }
}
