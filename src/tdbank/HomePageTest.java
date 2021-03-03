package tdbank;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends HomePage  {

    @Test
    //Test Case 10
    public void checkSmallBusinessOptionTest(){
        checkSmallBusinessOption();
        String expectedText = "Small Business Banking by TD Bank";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Page does not match");
    }
    @Test
    public void checkCommercialOptionTest(){
        checkCommercialOption();
        String expectedText = "TD Commercial Business Banking";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Page does not match");
    }
    public void checkInvestingWealthOption(){
        checkCommercialOption();
        String expectedText = "Wealth & Investment Management And Financial Planning | TD Wealth";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Page does not match");
    }
}
