package amazon;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends HomePage{
    @Test (priority = 2)
    public void testCheckSearchBox(){
        checkSearchBox();
        String expectedText ="\"Mask\"";
        String actualText =driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/span/h1/div/div[1]/div/div/span[3]")).getText();
        Assert.assertEquals(actualText, expectedText, "Product does not match");
    }
    @Test(priority = 1)
    public void testPageTitle(){
        String expectedText= "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText,expectedText, "Page Title not Matched");
    }
    @Test
    public void checkSignInTest(){
        checkSignInButton();
        String expectedText= "Your recent order";
        String actualText = driver.findElement(By.className("a-spacing-small")).getText();
        Assert.assertEquals(actualText, expectedText, "Did not match");
    }

}
