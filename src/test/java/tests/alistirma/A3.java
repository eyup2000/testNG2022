package tests.alistirma;

import Alistirma_Pages.TestPages;
import org.apache.poi.ss.formula.functions.T;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

import javax.security.auth.login.Configuration;

public class A3 {
    TestPages testPages = new TestPages();
    public void setUp(){
        Driver.getDriver().get(ConfigReader.getProperty("app_url_alistirma3"));
    }
    @Test
    public void sahibindenTest(){
    setUp();

    testPages.cerezKabul.click();

        Assert.assertTrue(testPages.logoTest.isDisplayed());

        testPages.otomobilTikla.click();

        testPages.BMWtikla.click();

        testPages.seri3.click();

        testPages.il.click();

        testPages.carpiTiklama.click();

        testPages.arabaSecme.click();
    }
}
