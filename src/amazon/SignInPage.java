package amazon;

import org.openqa.selenium.By;
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
    String userPassword = "Sage2010";
    String emailLogin = "easha2272@gmail.com";
    String continueButton="a-button-input";
    String signInButton ="auth-signin-button";

    public void loadProperties() throws IOException {
        String filePath = "../ExternalLibrary/properties/secret.properties";
        Properties prop = new Properties();
        InputStream inputStream = new FileInputStream(filePath);
        prop.load(inputStream);
       String password = prop.getProperty("password");
        String email = prop.getProperty("email");
    }


    public void checkSignInButton(){

        driver.findElement(By.id(singInButtonLocator)).click();
        driver.findElement(By.id(emailIdLocator)).sendKeys(emailLogin);
        driver.findElement(By.className(continueButton)).click();
        driver.findElement(By.id(passwordIdLocator)).sendKeys(userPassword);
        driver.findElement(By.id(signInButton)).click();

    }

    public void checkOrdersButton(){
    checkSignInButton();
    driver.findElement(By.xpath("//*[@id=\"nav-orders\"]/span[1]")).click();
    }

    public void checkDeliverLocation(){
        checkSignInButton();
        driver.findElement(By.className("nav-line-2")).click();
    }



}

