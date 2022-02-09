package co.com.certification.android6nov.runners;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src\\test\\resources\\features\\purchase.feature",
        glue =  "co.com.certification.android6nov.stepdefinitions",
        //tags = "@Decrement",
        //tags = "@WrongPhone",
        //tags = "@AllDataOK",
        tags = "@PayingNothing",
        //tags = "@OutofMoney",
        snippets = SnippetType.CAMELCASE
)

public class Purchase {
}
