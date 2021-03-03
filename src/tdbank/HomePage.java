package tdbank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePage {
    String tdbankUrl= "https:www.tdbank.com/";
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        String chromeDriverPath = "BrowserDriver/windows/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get(tdbankUrl);
    }


    public void checkSmallBusinessOption(){
        driver.findElement(By.linkText("Small Business")).click();
    }
    public void checkCommercialOption(){
        driver.findElement(By.linkText("Commercial")).click();
    }
    public void checkInvestingWealthOption(){
           driver.findElement(By.linkText("Investing & Wealth")).click();
    }
     @Test
    public void checkIndividualFamiliesButton(){
        checkInvestingWealthOption();
        driver.findElement(By.xpath("//*[@id=\"drag-id-tabsCarousel0\"]/div/li[1]/div[1]/span/span")).click();
    }

}
