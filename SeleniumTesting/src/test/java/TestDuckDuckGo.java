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

    @Test
    public void getTitleTest(){
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.DuckDuckGo.com");
        assertTrue(driver.getTitle().contains("DuckDuckGo"));
    }
}