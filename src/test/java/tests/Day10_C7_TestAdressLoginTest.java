package tests;

import org.testng.annotations.Test;
import pages.Day10_C6_TestAdressLoginPage;
import utilities.ConfigReader;
import utilities.Driver;

public class Day10_C7_TestAdressLoginTest {
    @Test
    public void testAdress() {
        //https://www.testyou.in/Login.aspx
        // Driver.getDriver().get("https://www.testyou.in/Login.aspx");

        Driver.getDriver().get(ConfigReader.getProperty("test_address_url"));

        Day10_C6_TestAdressLoginPage testAdressLoginPage = new Day10_C6_TestAdressLoginPage();

        testAdressLoginPage.email.sendKeys(ConfigReader.getProperty("test_address_email"));
        testAdressLoginPage.password.sendKeys(ConfigReader.getProperty("test_address_password"));
        testAdressLoginPage.loginButton.click();

        Driver.closeDriver();
    }
}
/*
Diyelimki 100 tane test case niz hepside sifre kullanmıssınız
Daha sonra sifre degisse ne yaparsınız
config.properties ile configuration.properties file gidip sadece sifrenin value kısmını degistirmemiz yeterlidir
 */
