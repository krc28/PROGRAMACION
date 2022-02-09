package co.com.tcs.certification.vivaair.stepdefinitions;

import co.com.tcs.certification.vivaair.questions.ValidateModify;
import co.com.tcs.certification.vivaair.questions.Validatedata;
import co.com.tcs.certification.vivaair.questions.Validateprice;
import co.com.tcs.certification.vivaair.tasks.EnterData;
import co.com.tcs.certification.vivaair.tasks.ModifyData;
import co.com.tcs.certification.vivaair.tasks.SelectFare;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.Map;

public class VivaAirStepDefinitions {

    @Managed
    private WebDriver driver;

    @Before
    public void setUp() {

        OnStage.setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(driver)));
        OnStage.theActorCalled("User");
    }

    @Given("^the user is on the viva air page$")
    public void theUserIsOnTheVivaAirPage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.vivaair.com/#/co/es"));
    }

    @Then("^the user will see the necessary fields for the reservation is visible$")
    public void theUserWillSeeTheNecessaryFieldsForTheReservationIsVisible() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Validatedata.home()));
    }

    @When("^the user enter your information for reserved a flight$")
    public void theUserEnterYourInformationForReservedAFlight(Map<String,String> data) {
        OnStage.theActorInTheSpotlight().attemptsTo(EnterData.flight(data));
    }

    @When("^the user selects the cheapest flight with a medium fare$")
    public void theUserSelectsTheCheapestFlightWithAMediumFare() {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectFare.cheapest());
    }

    @Then("^the total price should be correct$")
    public void theTotalPriceShouldBeCorrect() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Validateprice.flights()));
    }

    @When("^the user modify your information for reserved a flight$")
    public void theUserModifyYourInformationForReservedAFlight(Map<String,String> data) {
        OnStage.theActorInTheSpotlight().attemptsTo(ModifyData.flight(data));
    }

    @Then("^the text modify should be correct$")
    public void theTextModifyShouldBeCorrect() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateModify.text()));
    }

}
