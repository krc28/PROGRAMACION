package stepdefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import models.Estudiantes;
import models.PersonalInformation;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class CrearCuentaStepDefinitions {

    WebDriver driver;
    WebDriverWait wait;
    ChromeOptions options = new ChromeOptions();

    @Before
    public void configurar() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        options.addArguments("--start-maximized", "--incognito");
        driver = new ChromeDriver(options);
        wait = new WebDriverWait(driver, 5);
    }

    @Given("^el usuario se encuentra en la pagina del formulario$")
    public void elUsuarioSeEncuentraEnLaPaginaDelFormulario() {
        driver.get("https://www.advantageonlineshopping.com/#/register");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    @Then("^vera el mensaje bienvenido$")
    public void veraElMensajeBienvenido() {

        Assert.assertTrue(driver.findElement(By.xpath("//input[@name='usernameRegisterPage']")).isEnabled());

    }

    @When("^este es otro$")
    public void esteEsOtro() {
    }

    @Then("^otro then$")
    public void otroThen() {

    }

    @After
    public void cerrarNavegador() {
        driver.quit();
    }

    @Given("^y se logueo$")
    public void ySeLogueo() {
    }

    @When("^el usuario ingresa toda su informacion correctamente$")
    public void elUsuarioIngresaTodaSuInformacionCorrectamente() {
        driver.findElement(By.name("usernameRegisterPage")).sendKeys("Santiago");
        driver.findElement(By.name("emailRegisterPage")).sendKeys("dsfgfdgdgdg@we.com");
        driver.findElement(By.name("passwordRegisterPage")).sendKeys("123eedKK.eff");
        driver.findElement(By.name("confirm_passwordRegisterPage")).sendKeys("123eedKK.eff");
        driver.findElement(By.name("first_nameRegisterPage")).sendKeys("este");
        driver.findElement(By.name("last_nameRegisterPage")).sendKeys("otro");
        driver.findElement(By.name("phone_numberRegisterPage")).sendKeys("223435454");
    }

    @When("^el usuario ingresa toda su informacion excepto el campo email$")
    public void elUsuarioIngresaTodaSuInformacionExceptoElCampoEmail() {
        driver.findElement(By.name("usernameRegisterPage")).sendKeys("Santiago");
        driver.findElement(By.name("emailRegisterPage")).sendKeys("");
        driver.findElement(By.name("passwordRegisterPage")).sendKeys("123eedKK.eff");
        driver.findElement(By.name("confirm_passwordRegisterPage")).sendKeys("123eedKK.eff");
        driver.findElement(By.name("first_nameRegisterPage")).sendKeys("este");
        driver.findElement(By.name("last_nameRegisterPage")).sendKeys("otro");
        driver.findElement(By.name("phone_numberRegisterPage")).sendKeys("223435454");
    }

    @Then("^vera el mensaje del campo email$")
    public void veraElMensajeDelCampoEmail() {
        String esperado = "el email es requerido";
        String actual = driver.findElement(By.xpath("//label[@class='invalid']")).getText();
        Assert.assertEquals(esperado, actual);
    }

    @When("^el usuario ingresa el username (.*) y el email (.*)$")
    public void elUsuarioIngresaElUsername(String name, String email) {
        //driver.findElement(By.name("usernameRegisterPage")).sendKeys(name);
        //driver.findElement(By.name("emailRegisterPage")).sendKeys(email);
        System.out.println(name + email);
    }

    @Then("^vera el mensaje (.*)$")
    public void veraElMensaje(String arg1) {

    }

    //@And("^el salario (\\d+)$")
    @And("^el salario (.*)$")
    public void elSalario(double arg0) {
        System.out.println(arg0 * 2);
    }


    @And("^ingresa los demas datos$")
    public void ingresaLosDemasDatos(List<Estudiantes> info) {
        /*driver.findElement(By.name("usernameRegisterPage")).sendKeys(info.get(0));
        driver.findElement(By.name("emailRegisterPage")).sendKeys(info.get(1));
        driver.findElement(By.name("passwordRegisterPage")).sendKeys(info.get(2));
        driver.findElement(By.name("confirm_passwordRegisterPage")).sendKeys(info.get(3));*/
    }

    @And("^ingresa los demas datos con otra lista$")
    public void ingresaLosDemasDatosConOtraLista(List<PersonalInformation> info) {
        driver.findElement(By.name("usernameRegisterPage")).sendKeys(info.get(0).getUsername());
        driver.findElement(By.name("emailRegisterPage")).sendKeys(info.get(0).getEmail());
        driver.findElement(By.name("passwordRegisterPage")).sendKeys(info.get(0).getPassword());
        driver.findElement(By.name("confirm_passwordRegisterPage")).sendKeys(info.get(0).getConfirmPassword());
        System.out.println(info.get(1).getUsername());
        System.out.println(info.get(1).getEmail());
        System.out.println(info.get(1).getPassword());
        System.out.println(info.get(1).getConfirmPassword());
    }
}

