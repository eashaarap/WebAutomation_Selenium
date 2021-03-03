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
   // Test Case 12
    public void checkCommercialOptionTest(){
        checkCommercialOption();
        String expectedText = "TD Commercial Business Banking";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Page does not match");
    }
    //Test Case 11
    public void checkInvestingWealthOption(){
        checkCommercialOption();
        String expectedText = "Wealth & Investment Management And Financial Planning | TD Wealth";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Page does not match");
    }
    //Test Case 13
    @Test
    public void checkIndividualFamiliesButtonTest(){
        checkIndividualFamiliesButton();
        String expectedText = "Individual & Family Private Wealth & Investment Management | TD Wealth";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Page does not match");
    }
}
