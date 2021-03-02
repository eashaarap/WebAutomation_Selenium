package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class HomePage  {
    //Declare all variables
    String amazonUrl= "https:www.amazon.com/";
    String productName ="Mask";
    String searchBoxWebLocator = "twotabsearchtextbox";
    String searchButtonLocator = "nav-search-submit-button";
    WebDriver driver;



    @BeforeMethod
    public void setUp(){
        String chromeDriverPath = "BrowserDriver/windows/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get(amazonUrl);
    }

    public void checkSearchBox(){

        //Enter product name
        driver.findElement(By.id(searchBoxWebLocator)).sendKeys(productName);
        //click on searchButton
        driver.findElement(By.id(searchButtonLocator)).click();
    }


    @AfterMethod
    public void tearDown() throws InterruptedException {
//        Thread.sleep(30000);
        driver.quit();
    }
}
