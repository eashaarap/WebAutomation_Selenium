package ebay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePage {
    WebDriver driver;
    String ebayUrl ="https://www.ebay.com";
    String searchBoxLocator = "gh-ac";
    String productName = "toilet paper";
    String searchButtonLocator = "gh-btn";

    @BeforeMethod
    public void setUp(){
            String chromeDriverPath = "BrowserDriver/windows/chromedriver.exe";
            System.setProperty("webdriver.chrome.driver", chromeDriverPath);
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.get(ebayUrl);
    }

    public void checkSearchBox(){
        driver.findElement(By.id(searchBoxLocator)).sendKeys(productName);
        driver.findElement(By.id(searchButtonLocator)).click();
    }

}

