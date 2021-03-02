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
    public void checkBestSellersButtonTest(){
        checkBestSellersButton();
        String expectedText = "Best Sellers in Baby";
        String actualText = driver.findElement(By.xpath("//*[@id=\"zg-right-col\"]/h1")).getText();
        Assert.assertEquals(actualText, expectedText, "Page title does not match");
    }
    @Test
    public void checkBooksButtonTest(){
        checkBooksButton();
        String expectedText = "Amazon.com: Books";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Page title does not match");
    }


}
