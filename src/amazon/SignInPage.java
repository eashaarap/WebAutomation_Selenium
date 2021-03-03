package amazon;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class SignInPage extends HomePage{
    String singInButtonLocator = "nav-link-accountList";
    String emailIdLocator ="ap_email";
    String passwordIdLocator ="ap_password";
    String continueButton="a-button-input";
    String signInButton ="auth-signin-button";

    public  Properties loadProperties() throws IOException {
        String filePath = "../WebAutomation_Selenium/ExternalLibrary/properties/secret.properties";
        Properties prop = new Properties();
        InputStream inputStream = new FileInputStream(filePath);
        prop.load(inputStream);
        return prop;
    }

  @Test
  public void checkSignInButton() throws IOException {
        Properties prop = loadProperties();

        driver.findElement(By.id(singInButtonLocator)).click();
        driver.findElement(By.id(emailIdLocator)).sendKeys(prop.getProperty("email"));
        driver.findElement(By.className(continueButton)).click();
        driver.findElement(By.id(passwordIdLocator)).sendKeys(prop.getProperty("password"));
        driver.findElement(By.id(signInButton)).click();

    }

    public void checkOrdersButton() throws IOException {
    checkSignInButton();
    driver.findElement(By.xpath("//*[@id=\"nav-orders\"]/span[1]")).click();
    }

    public void checkDeliverLocation() throws IOException {
        checkSignInButton();
        driver.findElement(By.className("nav-line-2")).click();
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }



}

