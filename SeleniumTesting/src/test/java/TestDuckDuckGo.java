//ENSE375-Group D 
//Selenium Test
//Written by Nolan Flegel

//Testing DuckDuckGo in Firefox and Chrome

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class TestDuckDuckGo{
    private static WebDriver driver;

    @BeforeAll
    public static void setupTest() throws MalformedURLException {
        //Desired Capabilities
        DesiredCapabilities capability = new DesiredCapabilities();
        capability.setCapability("browser", "chrome");
       
        driver = new RemoteWebDriver(new URL("http://34.201.70.191:4444/wd/hub"), capability);
    }

    @Test
    public void getTitleTest(){
        // DesiredCapabilities capability = new DesiredCapabilities();
        // capability.setCapability("browser", "Chrome");
        //driver = new RemoteWebDriver(new URL("http://34.201.70.191:4445/wd/hub"), capability);
        driver.get("https://duckduckgo.com/");
        assertTrue(driver.getTitle().contains("DuckDuckGo"));
        driver.quit();
    }

    @Test
    public void getSearchResult(){
        // DesiredCapabilities capability = new DesiredCapabilities();
        // capability.setCapability("browser", "Chrome");
       // driver = new RemoteWebDriver(new URL("http://34.201.70.191:4445/wd/hub"), capability);
        driver.get("https://duckduckgo.com/");
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("uregina");
        element.submit();
        
        assertTrue(driver.getTitle().contains("uregina"));
        driver.quit();
    }
}