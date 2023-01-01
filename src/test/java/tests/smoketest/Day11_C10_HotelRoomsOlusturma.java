package tests.smoketest;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.DefaultPage;
import pages.HotelRoomsPage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;

public class Day11_C10_HotelRoomsOlusturma {

    LoginPage loginPage = new LoginPage();
    DefaultPage defaultPage = new DefaultPage();
    HotelRoomsPage hotelRoomsPage= new HotelRoomsPage();
    Faker faker=new Faker();

    @BeforeMethod
    public void setUp(){
        Driver.getDriver().get(ConfigReader.getProperty("app_url_login"));

        loginPage.advancedLink.click();
        loginPage.proceedLink.click();

        loginPage.userName.sendKeys(ConfigReader.getProperty("manager_username"));
        loginPage.password.sendKeys(ConfigReader.getProperty("manager_password"));
        loginPage.loginButton.click();

        //login basarılı oldugunu verify et
        Assert.assertTrue(defaultPage.addHotelRooms.isDisplayed());
    }

    @Test
    public void hotelRoomOlusturma(){
        //hotel management click et
        defaultPage.hotelManagement.click();

        //hotel rooms cilk et
        defaultPage.hotelRooms.click();

        //add hotelroom click yap
        hotelRoomsPage.addHotelRoomLink.click();

        //zorunlı alanları doldur
        //id hotel dropdown
        Select select = new Select(hotelRoomsPage.IdDropDown);
        select.selectByIndex(2);

        //code
        hotelRoomsPage.code.sendKeys(faker.code().imei());

        //name
        hotelRoomsPage.name.sendKeys(faker.gameOfThrones().character());

        //location
        hotelRoomsPage.location.sendKeys(faker.address().fullAddress());

        //description
        hotelRoomsPage.description.sendKeys(faker.howIMetYourMother().catchPhrase());

        //price
        //1.yol
        hotelRoomsPage.price.sendKeys(faker.code().asin());
        //2.yol
        //Actions actions = new Actions(Driver.getDriver());
       // actions.dragAndDrop(hotelRoomsPage.price600, hotelRoomsPage.price).perform();

        //room type
        Select roomType = new Select(hotelRoomsPage.roomTypeDropDown);
        roomType.selectByIndex(3);

        //Max adult
        hotelRoomsPage.maxAdultCount.sendKeys("2");

        //Max Childeren
        hotelRoomsPage.maxChildCount.sendKeys("4");

        //appruved
        hotelRoomsPage.approvedCheckBox.click();

        //save
        hotelRoomsPage.saveButton.click();

        //WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);

        Assert.assertTrue(hotelRoomsPage.massage.getText().contains("HotelRoom was inserted successfully"));


    }
}
