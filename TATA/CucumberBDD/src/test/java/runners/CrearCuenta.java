package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import models.PersonalInformation;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src\\test\\resources\\features\\crear_cuenta.feature",
        glue = "stepdefinitions",
        snippets = SnippetType.CAMELCASE,
        tags = "@BotonRegistrar")
        //tags = "@CampoEmail or @CreacionExitosa or @BotonRegistrar")
        //tags = "not @CreacionExitosa")
public class CrearCuenta {

}
