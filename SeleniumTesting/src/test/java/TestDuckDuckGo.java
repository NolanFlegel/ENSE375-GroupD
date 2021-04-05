//ENSE375-Group D 
//Selenium Test
//Written by Nolan Flegel

//Testing DuckDuckGo in Firefox and Chrome

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.openqa.selenium.WebDriver;

public class TestDuckDuckGo{

    @Test
    public void getTitleTest(){
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.DuckDuckGo.com");
        Assert.assertTrue(driver.getTitle().contains("DuckDuckGo"));
    }
}