package co.com.tcs.certification.advantage.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src\\test\\resources\\features\\create_account.feature",
        glue = "co.com.tcs.certification.advantage.stepdefinitions",
        snippets = SnippetType.CAMELCASE,
        tags = "@AccountSuccessfully")
public class CreateAccount {
}