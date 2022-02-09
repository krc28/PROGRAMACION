package co.com.certification.android6nov.stepdefinitions;

import co.com.tcs.certification.android6nov.exceptions.ValidateElemntExceptions;
import co.com.tcs.certification.android6nov.models.UserModel;
import co.com.tcs.certification.android6nov.questions.ValidateNegCred;
import co.com.tcs.certification.android6nov.questions.ValidatePrice;
import co.com.tcs.certification.android6nov.questions.ValidateSendPayBtn;
import co.com.tcs.certification.android6nov.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class PurchaseStepDefinitions {
    @Managed
    private WebDriver driver;

    @Before
    public void setup(){
        //OnStage.setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(Driver.driver())));
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("user");

    }
    @And("^user buys products$")
    public void userBuysProducts(List<UserModel> login) {
        OnStage.theActorInTheSpotlight().attemptsTo(MakePayment.makePayment(login));
    }

    @Then("^the user validates price decrement matches (.*)$")
    public void theUserValidatesPriceDecrementMatches(String crdt) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidatePrice.validatePrice(), Matchers.containsString(crdt)));
    }


    @And("^user pays out of money$")
    public void userPaysOutOfMoney(List<UserModel>login) {
        OnStage.theActorInTheSpotlight().attemptsTo(PayOutOfMoney.payOutOfMoney(login));
    }

    @Then("^the user validates negative credit matches (.*)$")
    public void theUserValidatesNegativeCreditMatches(String negCrdt) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateNegCred.validateNegCred(negCrdt), Matchers.containsString(negCrdt)));
    }

    @And("^user pays zero dollars$")
    public void userPaysZeroDollars(List<UserModel>login) {
        OnStage.theActorInTheSpotlight().attemptsTo(PayNothing.payNothing(login));
    }

    @Then("^user validate send button inactive$")
    public void userValidateSendButtonInactive() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateSendPayBtn.validateSendPayBtn(),
                Matchers.is(false)).orComplainWith(ValidateElemntExceptions.class, ValidateElemntExceptions.MESSAGE1));
    }

    @And("^user pays 50$")
    public void userPays(List<UserModel>login) {
        OnStage.theActorInTheSpotlight().attemptsTo(PaysFifty.paysFifty(login));
    }

    @And("^user fills wrong phone$")
    public void userFillsWrongPhone(List<UserModel>login) {
        OnStage.theActorInTheSpotlight().attemptsTo(FillWrongPhone.fillWrongPhone(login));
    }
}
