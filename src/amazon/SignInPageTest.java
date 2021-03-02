package amazon;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class SignInPageTest extends SignInPage{
    @Test
    public void checkSignInTest() throws IOException {
        checkSignInButton();
        String expectedText= "Your recent order";
        String actualText = driver.findElement(By.className("a-spacing-small")).getText();
        Assert.assertEquals(actualText, expectedText, "Did not match");
    }


    @Test
    public void checkDeliverLocationTest() throws IOException {
        checkDeliverLocation();
        String expectedText = "Choose your location";
        String actualText= driver.findElement(By.className("a-popover-header-content")).getText();
        Assert.assertEquals(actualText,expectedText, "Page does not match");

    }
    @Test
    public void checkOrderButtonTest(){
        checkOrdersButton();
        String expectedText ="Your Orders";
        String actualText = driver.findElement(By.xpath("//*[@id=\"yourOrdersContent\"]/div[3]/div[1]/h1")).getText();
        Assert.assertEquals(actualText, expectedText, "Button does not match");
    }

}
