package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomePageOld {
    public static void main(String[] args) throws InterruptedException {
        String amazonUrl= "https:www.amazon.com/";
        String productName ="mask";
        String searchBoxWebLocator = "twotabsearchtextbox";
        String searchButtonLocator = "nav-search-submit-button";

        //Setting up Chrome Browser
        //create the path you want to use for the according browswer
        String chromeDriverPath = "BrowserDriver/windows/chromedriver.exe";
        //to use the driver
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        //putting it in drive, by intializing the driver
        WebDriver driver = new ChromeDriver();
        //url you want to test
        driver.get(amazonUrl);

        //functions you can do with .manage()
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        //executing actions by searching by ids of specific elements: using id
        driver.findElement(By.id(searchBoxWebLocator)).sendKeys(productName);// we are using unique key 'id' and sending
        // a Text we want to search in our text box
        // now we want to click enter after typing a text
        driver.findElement(By.id(searchButtonLocator)).click();

        //by using rest of the elements
//        driver.findElement(By.className("nav-input nav-progressive-attribute")).click();
//        driver.findElement(By.cssSelector("coollala")).click();
//        driver.findElement(By.name("coollala")).click();
//        driver.findElement(By.linkText("coollala")).click();
//        driver.findElement(By.partialLinkText("coollala")).click();



//        Thread.sleep(10000);// wait for purpose
//        driver.close();



        //FireFox Browser
//        String fireFoxDriverPath = "BrowserDriver/windows/geckodriver.exe";
//        System.setProperty("webdriver.gecko.driver", fireFoxDriverPath);
//        WebDriver driver1 = new FirefoxDriver();
//        driver1.get("https:www.amazon.com/");
    }
}
