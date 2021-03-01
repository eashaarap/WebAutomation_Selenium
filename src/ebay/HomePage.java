package ebay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePage {
    WebDriver driver;
    String ebayUrl ="https://www.ebay.com";
    String searchBoxLocator = "gh-ac";
    String productName = "toilet paper";
    String searchButtonLocator = "gh-btn";
    String signInButtonLocator = "gh-ug";
    String userNameLocator = "floating-label__label floating-label__label--animate floating-label__label--inline";
    String continueButtonLocator ="signin-continue-btn";
    String firstName = "firstname";
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

    public void checksignInButton(){
        driver.findElement(By.id(signInButtonLocator)).click();
//        driver.findElement(By.className(userNameLocator)).sendKeys();
//        driver.findElement(By.id(signInButtonLocator)).click();
    }


    public void checkRegisterButton(){
        driver.findElement(By.xpath("//*[@id=\"gh-ug-flex\"]/a")).click();
        driver.findElement(By.id(firstName)).sendKeys("Easha");
        driver.findElement(By.id("lastname")).sendKeys("Khanam");
        driver.findElement(By.id("Email")).sendKeys("easha2202@test.com");
        driver.findElement(By.id("password")).sendKeys("Test#123!455");
        driver.findElement(By.id("EMAIL_REG_FORM_SUBMIT")).click();
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(30000);
        driver.quit();
    }

}

