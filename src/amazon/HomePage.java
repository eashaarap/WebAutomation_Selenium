package amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomePage {
    public static void main(String[] args) {
        //ChromeBrowser
        //create the path you want to use for the according browswer
        String chromeDriverPath = "BrowserDriver/windows/chromedriver.exe";
        //to use the driver
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        //putting it in drive
        WebDriver driver = new ChromeDriver();
        //url you want to test
        driver.get("https:www.amazon.com/");

        //FireFox Browswer
        String fireFoxDriverPath = "BrowserDriver/windows/geckodriver.exe";
        System.setProperty("webdriver.gecko.driver", fireFoxDriverPath);
        WebDriver driver1 = new FirefoxDriver();
        driver1.get("https:www.amazon.com/");
    }
}
