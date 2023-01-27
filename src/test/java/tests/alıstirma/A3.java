package tests.alıstirma;

import pages.TestPages;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

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
