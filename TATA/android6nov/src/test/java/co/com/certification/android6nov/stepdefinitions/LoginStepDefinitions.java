package co.com.certification.android6nov.stepdefinitions;

import co.com.tcs.certification.android6nov.models.UserModel;
import co.com.tcs.certification.android6nov.questions.WatchMessage;
import co.com.tcs.certification.android6nov.tasks.EnterCredentials;
import co.com.tcs.certification.android6nov.utils.Driver;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;

import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class LoginStepDefinitions {
    @Managed
    private WebDriver  driver;

    @Before
    public void setup(){
        //OnStage.setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(Driver.driver())));
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("user");

    }


    @When("^the user fills data correctly$")
    public void theUserFillsDataCorrectly(List<UserModel>login) {
        OnStage.theActorInTheSpotlight().attemptsTo(EnterCredentials.enterCredentials(login));
    }

    @Then("^the user should watch a message$")
    public void theUserShouldWatchAMessage() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(WatchMessage.watchMessage(), Matchers.is(true)));
    }

}
