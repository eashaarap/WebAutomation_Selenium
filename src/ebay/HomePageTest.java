package ebay;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends HomePage{

    @Test
    //test case #2
    public void checkSearchBoxTest(){
        checkSearchBox();
        String expectedText="toilet paper";
        String actualText=driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/div/div[2]/div[1]/div[1]/h1/span[2]")).getText();
        Assert.assertEquals(actualText, expectedText, "Search result does not match");
    }
    @Test
    //test case #3
    public void signInButtonTest(){
        checksignInButton();
        String expectedText="Please verify yourself to continue";
        String actualText = driver.findElement(By.id("areaTitle")).getText();
        Assert.assertEquals(actualText, expectedText, "Sign in page does not match");

    }
    @Test
    //Test Case #4
    public void checkRegisterButtonTest(){
        checkRegisterButton();
        String expectedText ="giant-text-2 txt-center title";
        String actualText = driver.findElement(By.className("giant-text-2 txt-center title")).getText();
        Assert.assertEquals(actualText, expectedText, "Registration Button Doesnt Match");
    }


}
