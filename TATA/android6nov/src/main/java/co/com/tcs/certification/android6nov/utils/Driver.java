package co.com.tcs.certification.android6nov.utils;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Driver {

   public static WebDriver driver() {
       DesiredCapabilities capabilities = new DesiredCapabilities();
       capabilities.setCapability("deviceName", "emulator-5554");
       capabilities.setCapability("platformName", "Android");
       capabilities.setCapability("platformVersion", "8.1");
       try {
           return new AppiumDriver<>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
       } catch (MalformedURLException e) {
           e.printStackTrace();
           return null;
       }
   }
}
