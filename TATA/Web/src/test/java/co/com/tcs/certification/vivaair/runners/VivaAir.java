package co.com.tcs.certification.vivaair.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src\\test\\resources\\features\\viva_air.feature",
        glue = "co.com.tcs.certification.vivaair.stepdefinitions",
        snippets = SnippetType.CAMELCASE)


public class VivaAir {
}
