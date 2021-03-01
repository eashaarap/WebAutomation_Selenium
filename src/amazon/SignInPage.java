package amazon;

import org.openqa.selenium.By;

public class SignInPage extends HomePage{
    String singInButtonLocator = "nav-link-accountList";
    String emailIdLocator ="ap_email";
    String passwordIdLocator ="ap_password";
    String userPassword = "Sage2010";
    String emailLogin = "easha2272@gmail.com";
    String continueButton="a-button-input";
    String signInButton ="auth-signin-button";

    public void checkSignInButton(){
        driver.findElement(By.id(singInButtonLocator)).click();
        driver.findElement(By.id(emailIdLocator)).sendKeys(emailLogin);
        driver.findElement(By.className(continueButton)).click();
        driver.findElement(By.id(passwordIdLocator)).sendKeys(userPassword);
        driver.findElement(By.id(signInButton)).click();

    }

    public void checkDeliverLocation(){
        checkSignInButton();
        driver.findElement(By.className("nav-line-2")).click();
    }

}

