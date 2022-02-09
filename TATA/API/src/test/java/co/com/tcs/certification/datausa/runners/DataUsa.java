package co.com.tcs.certification.datausa.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src\\test\\resources\\features\\data_usa.feature",
        glue = "co.com.tcs.certification.datausa.stepdefinitions",
        snippets = SnippetType.CAMELCASE )

public class DataUsa {
}
