package tests.smoketest;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;

public class Day11_C9_NegativeLoginTest {
    /*
    invalidPassword()
    When Kullanıcı sadece yanlış password girer
    Then Kullanıcı ‘wrong password’ mesajını verify eder
    Test Data:
    Url: http://www.carettahotel.com/
    username : manager
    password  : Manage
     */

    @Test
    public void invalidPassword() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("app_url_login"));

        LoginPage loginPage = new LoginPage();
        loginPage.advancedLink.click();
        loginPage.proceedLink.click();
//1. yöntem
//        loginPage.userName.sendKeys("manager");
//        loginPage.password.sendKeys("Manage"+ Keys.ENTER);

        //2.yöntem
        loginPage.userName.sendKeys(ConfigReader.getProperty("manager_username"));
        loginPage.password.sendKeys(ConfigReader.getProperty("wrong_manager_password"));
        loginPage.loginButton.click();

        System.out.println(loginPage.errorMassage.getText());
        Thread.sleep(2000);
        Assert.assertTrue(loginPage.errorMassage.getText().contains("Wrong password"));

        Driver.closeDriver();
    }

    /*invalidID()
    When Kullanıcı sadece yanlış username girer
    Then Kullanıcı ‘Try again please’ mesajını verify eder
    Test Data:
    Url: http://www.carettahotel.com/
    username : manager123
    password  : Manager1!
    */
@Test
    public void invalidID(){
    Driver.getDriver().get(ConfigReader.getProperty("app_url_login"));

    LoginPage loginPage=new LoginPage();

    loginPage.advancedLink.click();
    loginPage.proceedLink.click();

    loginPage.userName.sendKeys(ConfigReader.getProperty("wrong_manager_username"));
    loginPage.password.sendKeys(ConfigReader.getProperty("manager_password"));
    loginPage.loginButton.click();

   String actualMassage = loginPage.errorMassage.getText();
    Assert.assertTrue(actualMassage.contains("Try again please"));

    Driver.closeDriver();
}
/*
    invalidIDAndPassword()
    When Kullanıcı hem yanlış username ve password girer
    Then Kullanıcı ‘Username or password is incorrect, please correct them and try again’ mesajını verify eder
    Test Data:
    Url: http://www.carettahotel.com/
    username : manager123
    password  : Manage!

 */

    @Test
    public void invalidIDAndPassword(){
        Driver.getDriver().get(ConfigReader.getProperty("app_url_login"));

        LoginPage loginPage = new LoginPage();
        loginPage.advancedLink.click();
        loginPage.proceedLink.click();

        loginPage.userName.sendKeys(ConfigReader.getProperty("wrong_manager_username"));
        loginPage.password.sendKeys(ConfigReader.getProperty("wrong_manager_password"));
        loginPage.loginButton.click();

        String actual = loginPage.errorMassage.getText();
        System.out.println(actual);
        Assert.assertTrue(actual.contains("Username or password is incorrect, please correct them and try again"));

        Driver.closeDriver();
    }
}
