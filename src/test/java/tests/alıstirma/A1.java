package tests.alıstirma;

import com.github.javafaker.Faker;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.hesapCreate;
import utilities.ConfigReader;
import utilities.Driver;

public class A1 {

    hesapCreate hesapCreate = new hesapCreate();
    Faker faker = new Faker();

    public void seUp(){
        Driver.getDriver().get(ConfigReader.getProperty("app_url_alistirma"));

    }

    @Test(groups = "test-group-1")
    public void a(){
    seUp();
        hesapCreate.login.click();

        hesapCreate.name.sendKeys(faker.name().firstName());

        hesapCreate.email.sendKeys(faker.internet().emailAddress());

        hesapCreate.signup.click();

        hesapCreate.buttonTikla.click();

        hesapCreate.password.sendKeys(faker.internet().password());

        Select select=new Select(hesapCreate.days);
        select.selectByIndex(9);

        Select select1=new Select(hesapCreate.months);
        select1.selectByIndex(3);

        Select select2=new Select(hesapCreate.years);
        select2.selectByIndex(19);

        hesapCreate.buttonTikla2.click();

        hesapCreate.firstName.sendKeys(faker.name().firstName());

        hesapCreate.lastName.sendKeys(faker.name().lastName());

        hesapCreate.company.sendKeys(faker.company().name());

        hesapCreate.address1.sendKeys(faker.address().fullAddress());

        hesapCreate.address2.sendKeys(faker.address().fullAddress());

        Select select3 = new Select(hesapCreate.sehir);
        select3.selectByValue("Canada");

        hesapCreate.state.sendKeys(faker.address().state());

        hesapCreate.city.sendKeys(faker.address().city());

        hesapCreate.zipcode.sendKeys(faker.address().zipCode());

        hesapCreate.mobileNumber.sendKeys(faker.phoneNumber().cellPhone());

        hesapCreate.createAccount.click();

       String actualText = hesapCreate.kontrol.getText();

        Assert.assertTrue(actualText.contains("ACCOUNT CREATED!"));


        Driver.closeDriver();

    }
}
