package amazon;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignInPageTest extends SignInPage{
    @Test
    public void checkSignInTest(){
        checkSignInButton();
        String expectedText= "Your recent order";
        String actualText = driver.findElement(By.className("a-spacing-small")).getText();
        Assert.assertEquals(actualText, expectedText, "Did not match");
    }


    @Test
    public void checkDeliverLocationTest(){
        checkDeliverLocation();
        String expectedText = "Choose your location";
        String actualText= driver.findElement(By.className("a-popover-header-content")).getText();
        Assert.assertEquals(actualText,expectedText, "Page does not match");


    }

}
