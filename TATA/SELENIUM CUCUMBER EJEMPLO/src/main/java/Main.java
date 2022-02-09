import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Main {
    public static void main(String[] args)  {

        System.setProperty("webdriver.chrome.driver","C:\\driver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        //Este sirve para crecer la pestaña de la pagina
        driver.manage().window().maximize();
        // para buscar una dirrecion de la pagina
        driver.get("https://es.wikipedia.org/wiki/Wikipedia:portada");
        //traer la posicion de un obejto de la cordana en la posicicon horizontal
        System.out.println(driver.manage().window().getPosition().getX());
        //traer la posicion de un obejto de la cordana en la posicicon vertical
        System.out.println(driver.manage().window().getPosition().getY());
        //muestra el tamaño
        System.out.println(driver.manage().window().getSize());
        //System.out.println(driver.manage().window().getPosition().move(1000,500););
        //driver.manage().window().setPosition(Point );

        //titulo de la pgagina
        System.out.println(driver.getTitle());
        //trae la url
        System.out.println(driver.getCurrentUrl());
        //caputrar y buscar ña id de un componente de id o de una localizacion luego le manda es informacion
       // driver.findElement(By.id("searchInput")).sendKeys("los simpsons");

        // tirar un escenario
       /*
        driver.findElement(By.linkText("en español.")).click();
        */
        // saca saca y solo pone un elelemnto en el programa


        By SEARCH= By.id("searchInput");

        WebElement cajatexto   =  driver.findElement(SEARCH);
        cajatexto.sendKeys("Los simpson");
        driver.findElement((By.xpath("//input[@class='vector-search-box-input']"))).submit();
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        // lista de los elementos con name mw-searchSuggest-link
        List<WebElement> elementos  = driver.findElements((By.className("mw-searchSuggest-link")));

        // imrprime los elementos
        for (WebElement e: elementos
        ) {
            System.out.println(e.getText());

        }

        for (WebElement e: elementos
             ) {
           if(e.getText().equals("Los Simpson")){
                e.click();
                break;
            }

        }


        driver.findElement(By.linkText(("estadounidense"))).click();


        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        //busca emplicitas
        WebDriverWait wait =  new WebDriverWait(driver,5);

        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("SEARCH"))));








        // cierre navegador
         //driver.quit();


    }
}
