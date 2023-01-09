package tests.alistirma;

import com.github.javafaker.Faker;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Alistirma_Pages.hesapCreate2;
import utilities.ConfigReader;
import utilities.Driver;

public class A2 {
    hesapCreate2 hesapCreate2 = new hesapCreate2();

    Faker faker= new Faker();

    @BeforeMethod
    public void setUp(){
        Driver.getDriver().get(ConfigReader.getProperty("app_url_alistirma2"));

    }

    @Test
    public void Alisitrma2() throws InterruptedException {


        //hesapCreate2.onaylama.click();
        Thread.sleep(7000);
        hesapCreate2.login.click();

        hesapCreate2.registerNow.click();

        hesapCreate2.buttonTiklama.click();

        hesapCreate2.userName.sendKeys(faker.name().username());

        hesapCreate2.password.sendKeys("qMPQdUr9A*?zTGD");

        hesapCreate2.confirmPassword.sendKeys("qMPQdUr9A*?zTGD");

        Assert.assertTrue(hesapCreate2.assert1.getText().contains("Personal information"));
        System.out.println(hesapCreate2.assert1.getText());

        hesapCreate2.firstName.sendKeys(faker.name().firstName());

        hesapCreate2.lastName.sendKeys(faker.name().lastName());

        hesapCreate2.jobTitle.sendKeys(faker.job().title());

        hesapCreate2.email.sendKeys(faker.internet().emailAddress());

        hesapCreate2.phoneNumber.sendKeys(faker.phoneNumber().cellPhone());

        System.out.println(hesapCreate2.assert2.getText());
        Assert.assertTrue(hesapCreate2.assert2.getText().contains("Company information"));

        hesapCreate2.CompanyName.sendKeys(faker.name().name());

        Select select = new Select(hesapCreate2.country);
        select.selectByValue("TR");
        Thread.sleep(2000);

        hesapCreate2.adress1.sendKeys(faker.address().fullAddress());

        hesapCreate2.adress2.sendKeys(faker.address().fullAddress());

        hesapCreate2.adress3.sendKeys(faker.address().fullAddress());

        hesapCreate2.adress4.sendKeys(faker.address().fullAddress());

        hesapCreate2.postaCode.sendKeys(faker.address().zipCode());
        Thread.sleep(2000);

        hesapCreate2.city.sendKeys(faker.address().city());

        hesapCreate2.state.sendKeys(faker.address().state());
        hesapCreate2.country2.sendKeys(faker.address().country());

        hesapCreate2.createButton.click();

























    }
}
