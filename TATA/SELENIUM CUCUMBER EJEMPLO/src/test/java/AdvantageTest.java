import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class AdvantageTest {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public static void setup(){
        System.setProperty("webdriver.chrome.driver","C:\\driver\\chromedriver_win32\\chromedriver.exe");
    }



    @Before
    public  void config(){

        driver = new ChromeDriver();
        wait = new WebDriverWait(driver,5);
        driver.manage().window().maximize();
        driver.get("https://www.advantageonlineshopping.com/#/register");

    }

    @Test
    public void validarTitilo() throws InterruptedException {

        Thread.sleep(5000);
        String resultadoEsperado="CREATE ACCOUNT";
        String resultado=driver.findElement(By.xpath("//*[@class='roboto-regular sticky fixedImportant ng-scope']")).getText();


        Assert.assertEquals(resultadoEsperado,resultado);
    }

    @Test
    public void validaBoton() {

        Assert.assertTrue(driver.findElement(By.xpath("//*[@class='ng-pristine ng-valid ng-scope ng-touched invalid']")).isDisplayed());
    }


}
