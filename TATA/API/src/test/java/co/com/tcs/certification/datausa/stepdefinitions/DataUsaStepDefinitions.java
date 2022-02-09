package co.com.tcs.certification.datausa.stepdefinitions;

import co.com.tcs.certification.datausa.models.RegisterInformation;
import co.com.tcs.certification.datausa.questions.*;
import co.com.tcs.certification.datausa.tasks.EnterParameter;
import co.com.tcs.certification.datausa.tasks.NewRegister;
import co.com.tcs.certification.datausa.utils.Constants;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import org.hamcrest.Matchers;

import java.util.List;
import java.util.Map;

public class DataUsaStepDefinitions {

    @Before
    public void setUp() {
        OnStage.setTheStage(Cast.whereEveryoneCan(CallAnApi.at(Constants.END_POINT)));
        OnStage.theActorCalled("user");
    }

    @When("^the user enters query parameters$")
    public void theUserEntersQueryParameters(Map<String,String> param) {
        OnStage.theActorInTheSpotlight().attemptsTo(EnterParameter.api(param));
    }

    @Then("^the user will see the required fields$")
    public void theUserWillSeeTheRequiredFields(List<String> data) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Verifydata.text(data)));
    }

    @Then("^the user will see the code Population (.*)$")
    public void theUserWillSeeTheCodePopulation(int code) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyCodepopulation.api(), Matchers.equalTo(code)));
    }

    @Then("^the user will see the ID Year (.*)$")
    public void theUserWillSeeTheIDYear(int id) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyIdYear.api(), Matchers.equalTo(id)));
    }

    @Then("^the user will see the ID Nation (.*)$")
    public void theUserWillSeeTheIDNation(String id) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyIdNation.api(), Matchers.equalTo(id)));
    }

    @When("^the user creates a new register$")
    public void theUserCreatesANewRegister(List<RegisterInformation>newData) {
        OnStage.theActorInTheSpotlight().attemptsTo(NewRegister.api(newData));
    }

    @Then("^the user will see their code registration created successfully (.*)$")
    public void theUserWillSeeTheirCodeRegistrationCreatedSuccessfully(int code) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyCodeRegister.api(), Matchers.equalTo(code)));
    }

}
