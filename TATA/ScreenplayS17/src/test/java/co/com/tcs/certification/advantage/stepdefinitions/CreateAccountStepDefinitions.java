package co.com.tcs.certification.advantage.stepdefinitions;

import co.com.tcs.certification.advantage.models.PersonalInformation;


import co.com.tcs.certification.advantage.questions.ValidateEmail;
import co.com.tcs.certification.advantage.questions.ValidateStateButton;
import co.com.tcs.certification.advantage.tasks.AccessForm;
import co.com.tcs.certification.advantage.tasks.EntersEmail;
import co.com.tcs.certification.advantage.tasks.EntersInformation;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.ClearCookiesPolicy;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class CreateAccountStepDefinitions {

    @Managed(clearCookies = ClearCookiesPolicy.BeforeEachTest)
    private WebDriver hisBrowser;

    @Before
    public void setUp() {
        OnStage.setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(hisBrowser)));
        OnStage.theActorCalled("Santiago");
    }

    @Given("^the user is on the main page$")
    public void theUserIsOnTheMainPage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.advantageonlineshopping.com/#/"));
    }

    @Given("^the user goes to the register form$")
    public void theUserGoesToTheRegisterForm() {
        OnStage.theActorInTheSpotlight().wasAbleTo(AccessForm.register());
    }

    @When("^the user enters its information$")
    public void theUserEntersItsInformation(List<PersonalInformation> info) {
        OnStage.theActorInTheSpotlight().attemptsTo(EntersInformation.personal(info));
    }

    @Then("^the user will watch the register button enabled$")
    public void theUserWillWatchTheRegisterButtonEnabled() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateStateButton.register(), Matchers.is(true)));

    }

    @Then("^the user will watch the register button disabled$")
    public void theUserWillWatchTheRegisterButtonDisabled() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateStateButton.register(), Matchers.is(false)));
    }

    @When("^the user enters the email (.*)$")
    public void theUserEntersTheEmail(String email) {
        OnStage.theActorInTheSpotlight().attemptsTo(EntersEmail.personal(email));
    }

    @Then("^the user will watch the message (.*)$")
    public void theUserWillWatchTheMessage(String msj) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateEmail.message(), Matchers.equalTo(msj)));
    }
}
