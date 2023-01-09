package Alistirma_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import utilities.ConfigReader;
import utilities.Driver;

public class hesapCreate {
    public hesapCreate(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[.=' Signup / Login']")
    public WebElement login;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement name;

    @FindBy(xpath = "(//input[@name='email'])[2]")
    public  WebElement email;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement signup;

    @FindBy(id = "id_gender1")
    public WebElement buttonTikla;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement password;

    @FindBy(id = "days")
    public WebElement days;

    @FindBy(id = "months")
    public WebElement months;

    @FindBy(id ="years" )
    public WebElement years;

    @FindBy(xpath = "//input[@id='newsletter']")
    public WebElement buttonTikla2;

    @FindBy(xpath = "//input[@id='first_name']")
    public WebElement firstName;

    @FindBy(xpath = "//input[@id='last_name']")
    public WebElement lastName;

    @FindBy(xpath = "//input[@id='company']")
    public WebElement company;

    @FindBy(xpath = "//input[@id='address1']")
    public WebElement address1;

    @FindBy(xpath = "//input[@id='address2']")
    public WebElement address2;

    @FindBy(xpath = "//select[@id='country']")
    public WebElement sehir;

    @FindBy(xpath = "//input[@id='state']")
    public WebElement state;

    @FindBy(xpath = "//input[@id='city']")
    public WebElement city;

    @FindBy(xpath = "//input[@id='zipcode']")
    public WebElement zipcode;

    @FindBy(xpath = "//input[@id='mobile_number']")
    public WebElement mobileNumber;

    @FindBy(xpath = "(//button[@type='submit'])[1]")
    public WebElement createAccount;

    @FindBy(xpath = "(//b)")
    public WebElement kontrol;

}
