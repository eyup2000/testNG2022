package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MainPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtils;

public class Day14_C15_JSUtilTest {


    MainPage mainPage;
    LoginPage loginPage;
    @Test
    public void scrollIntoView(){

        Driver.getDriver().get(ConfigReader.getProperty("app_url"));
        mainPage = new MainPage();
        try{
            mainPage.advancedLink.click();
            mainPage.proceedLink.click();
        }catch (Exception e){
            System.out.println("Advenced linki görünmedi");
        }
     WebElement haveAquestion = Driver.getDriver().findElement(By.xpath("(//h2)[13]"));

        JSUtils.scrollIntoViewJS(haveAquestion);

        Assert.assertEquals(haveAquestion.getText(),"Have a Questions?");

        Assert.assertTrue(haveAquestion.isDisplayed());
    }

    @Test
    public void clickByJS(){
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));
        mainPage = new MainPage();
        try{
            mainPage.advancedLink.click();
            mainPage.proceedLink.click();
        }catch (Exception e){
            System.out.println("Advenced linki görünmedi");
        }

//       WebElement lohinLink = Driver.getDriver().findElement(By.linkText("Log in"));
//        JSUtils.clickElementByJS(lohinLink);

        WebElement checkAvailability = Driver.getDriver().findElement(By.xpath("//input[@type='submit']"));
        JSUtils.clickElementByJS(checkAvailability);

    }
    @Test
    public void flashJS(){
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));
        mainPage = new MainPage();
        try{
            mainPage.advancedLink.click();
            mainPage.proceedLink.click();
        }catch (Exception e){
            System.out.println("Advenced linki görünmedi");
        }

        WebElement checkAvailabilityButton = Driver.getDriver().findElement(By.xpath("//input[@type='submit']"));
        JSUtils.flash(checkAvailabilityButton);

        Driver.closeDriver();
    }

    @Test
    public void changeColor(){
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));
        mainPage = new MainPage();
        try{
            mainPage.advancedLink.click();
            mainPage.proceedLink.click();
        }catch (Exception e){
            System.out.println("Advenced linki görünmedi");
        }
        WebElement checkAvailabilityButton = Driver.getDriver().findElement(By.xpath("//input[@type='submit']"));
        JSUtils.changeColor("red",checkAvailabilityButton);


    }
    @AfterMethod
    public void closeDriver(){
        Driver.closeDriver();
    }
}
