package tests.smoketest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DefaultPage;
import pages.LoginPage;
import pages.MainPage;
import utilities.ConfigReader;
import utilities.Driver;

public class Day10_C8_PositiveLoginTest {
    @Test
    public void positiveLoginTest(){
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));

        //1.page object oluştur ==> mainPage ve LoginPage
        //2.test class oluştur
        //3. page oluştur
        //---mainPage object oluştur
        //---liginPage object oluştur


        MainPage mainPage = new MainPage();
        mainPage.advancedLink.click();
        mainPage.proceedLink.click();

        mainPage.mainPageLoginLink.click();

        //bu noktada loginPage teyiz
        //LoginPage object oluştur

        LoginPage loginPage = new LoginPage();
//        loginPage.userName.sendKeys("manager");
//        loginPage.password.sendKeys("Manage123");

        loginPage.userName.sendKeys(ConfigReader.getProperty("manager_username"));
        loginPage.password.sendKeys(ConfigReader.getProperty("manager_password"));

        loginPage.loginButton.click();

        //Adduser butonunu kullanarak defaul page giris yaptıgımızı verify edin
        //Bu noktada defauldpage clasındayiz

        DefaultPage defaultPage = new DefaultPage();
     Boolean login =   defaultPage.addUser.isDisplayed();
        Assert.assertTrue(login);


    }
}
