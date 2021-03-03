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
    public void checkTodaysDealButton(){
        driver.findElement(By.linkText("Today's Deals")).click();
    }
    public void checkPrimeButton(){
        driver.findElement(By.linkText("Prime")).click();
    }
    public void checkCustomerServiceButton(){
        driver.findElement(By.linkText("Customer Service")).click();
    }
    public void checkFashionButton(){
        driver.findElement(By.linkText("Fashion")).click();
    }
    public void checkKindleBooksButton(){
        driver.findElement(By.linkText("Kindle Books")).click();
    }

    public void checkBooksButton(){
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[6]")).click();
        driver.findElement(By.id(searchBoxWebLocator)).sendKeys("A thousand splendid suns");
        driver.findElement(By.id(searchButtonLocator)).click();
    }

    public void checkBestSellersButton(){
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"zg_browseRoot\"]/ul/li[8]/a")).click();
    }


    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(6000);
        driver.quit();
    }
}
