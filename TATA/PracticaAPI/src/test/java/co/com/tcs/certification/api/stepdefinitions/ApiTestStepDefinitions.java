package co.com.tcs.certification.api.stepdefinitions;

import co.com.tcs.certification.api.questions.ValidateName;
import co.com.tcs.certification.api.questions.VerifyCode;
import co.com.tcs.certification.api.tasks.ConsultId;
import co.com.tcs.certification.api.tasks.ConsultInfo;
import co.com.tcs.certification.api.tasks.CreateUser;
import co.com.tcs.certification.api.utils.Constants;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.serenitybdd.screenplay.rest.interactions.Get;
import org.hamcrest.Matchers;

import java.util.List;

public class ApiTestStepDefinitions {

    //Actor actor;

    @Before
    public void setUp() {
        OnStage.setTheStage(Cast.whereEveryoneCan(CallAnApi.at(Constants.END_POINT)));
        OnStage.theActorCalled("User");
        SerenityRest.useRelaxedHTTPSValidation();
        //actor.assignName("User");
        //Actor.named("User");
    }

    @When("^the user consults the api information$")
    public void theUserConsultsTheApiInformation()
    {
        OnStage.theActorInTheSpotlight().attemptsTo(ConsultInfo.api());
        /*OnStage.theActorInTheSpotlight().attemptsTo(Get.resource(Constants.RESOURCE).
                with(requestSpecification -> requestSpecification.
                param("page","2").
                        param("id","9").log().all()));*/
    }


    @Then("^the user will see the response code (.*)$")
    public void theUserWillSeeTheResponseCode(int status)
    {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyCode.response(), Matchers.equalTo(status)));
    }


    @When("^the user consults the user with id (.*)$")
    public void theUserConsultsTheUserWithId(String id) {
        OnStage.theActorInTheSpotlight().attemptsTo(ConsultId.user(id));
    }

    @Then("^the user will see the name (.*)$")
    public void theUserWillSeeTheNameTobias(String name)
    {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateName.name(), Matchers.equalTo(name)));
    }

    @When("^the user sends the information for registration$")
    public void theUserSendsTheInformationForRegistration(List<String> register)
    {
        OnStage.theActorInTheSpotlight().attemptsTo(CreateUser.user(register));
    }
}
