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

    @Test
    //Test Case 15
    public void checkMotorsButtonTest(){
        checkMotorsButton();
        String expectedText="eBay Motors: Auto Parts and Vehicles | eBay";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Page does not match");

    }
    @Test
    //Test Case 17
    public void checkFashionButtonTest(){
        checkFashionButton();
        String expectedText="Fashion products for sale | eBay";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Page does not match");

    }
    @Test
    //Test Case 16
    public void checkElectronicsButtonTest(){
        checkElectronicsButton();
        String expectedText="Electronics products for sale | eBay";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Page does not match");
    }
    @Test
    //Test Case 17
    public void checkCollectiblesArtButtonTest(){
        checkCollectiblesArtButton();
        String expectedText="Collectibles & Art products for sale | eBay";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Page does not match");
    }
    @Test
    //Test Case 18
    public void checkHomeGardenButtonTest(){
        checkHomeGardenButton();
        String expectedText="Home & Garden products for sale | eBay";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Page does not match");
    }
    @Test
    //Test Case 19
    public void checkSportingGoodsButtonTest(){
        checkSportingGoodsButton();
        String expectedText="Sporting Goods for sale | eBay";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Page does not match");
    }
    @Test
    //Test Case 20
    public void checkToyButtonTest(){
        checkToysButton();
        String expectedText="Toys & Hobbies products for sale | eBay";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Page does not match");
    }
    @Test
    //Test Case 21
    public void checkBusinessIndustrialButton(){
        checkBusinessIndustrialButton();
        String expectedText="Business & Industrial products for sale | eBay";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Page does not match");
    }
    @Test
    //Test Case 22
    public void checkMusicButton(){
        checkMusicButton();
        String expectedText="Music products for sale | eBay";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Page does not match");
    }



}
