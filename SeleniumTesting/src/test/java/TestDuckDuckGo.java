//ENSE375-Group D 
//Selenium Test
//Written by Nolan Flegel

//Testing DuckDuckGo in Firefox and Chrome

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestDuckDuckGo{
    private WebDriver driver;

    @Test
    public void getTitleTest(){
        driver = new ChromeDriver();
        driver.get("https://duckduckgo.com/");
        assertTrue(driver.getTitle().contains("DuckDuckGo"));
        driver.quit();
    }

    @Test
    public void getSearchResult(){
        driver = new ChromeDriver();
        driver.get("https://duckduckgo.com/");
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("uregina");
        element.submit();
        
        assertTrue(driver.getTitle().contains("uregina"));
        driver.quit();
    }
}