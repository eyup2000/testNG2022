package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class Day09_C5_FristConfigTest {
    //   app_url  'e git
    //   Title'in' Caretta Hotel - Home oldugunu assert et

    @Test
    public void firstConfigTest() throws InterruptedException {
        //Driver.getDriver().get("http://www.carettahotel.com/\n");

        Driver.getDriver().get(ConfigReader.getProperty("app_url"));
        Thread.sleep(5000);

        //   Title'in' Caretta Hotel - Home oldugunu assert et
       String actualTitle = Driver.getDriver().getTitle();

     String expectedTitle = ConfigReader.getProperty("app_title");
        Assert.assertEquals(actualTitle,expectedTitle);
    }
}
