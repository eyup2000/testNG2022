package tests.alıstirma;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.pagess;
import utilities.Driver;

public class A4 {



    @BeforeMethod
    public void setup(){

        Driver.getDriver().get("https://demoqa.com/automation-practice-form");
    }

    @Test
    public void test() throws InterruptedException {
        Faker faker = new Faker();

        pagess page = new pagess();

        page.firstName.sendKeys(faker.name().firstName());
        page.lastName.sendKeys(faker.name().lastName());
        page.email.sendKeys(faker.internet().emailAddress());
        page.phoneNumber.sendKeys(faker.phoneNumber().cellPhone());
        page.gender.click();
       // page.date.sendKeys("23/06/1999");
        Thread.sleep(4000);
        //page.subject.sendKeys(faker.harryPotter().character());
        page.spor.click();
        page.music.click();
        //3- Kullanici masaustunden bir resim secer
        //homePath al
        String homePath = System.getProperty(("user.home"));
        String resim = homePath + "\\Downloads\\komikesek.jpg";
        page.dosyaSec.sendKeys(resim);

        Thread.sleep(2000);

        page.address.sendKeys(faker.address().fullAddress());


        Select select = new Select(page.state);
        select.selectByIndex(0);

        Select select1 = new Select(page.city);
        select1.selectByIndex(1);


        page.button.click();
    }
}
