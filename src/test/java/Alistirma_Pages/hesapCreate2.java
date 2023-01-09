package Alistirma_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class hesapCreate2 {

    public hesapCreate2() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//a[@class='call']")
    public WebElement onaylama;

    @FindBy(id = "pfe-navigation__account-toggle")
    public WebElement login;

    @FindBy ( xpath = "//a[@class='account-register-link']")
    public WebElement registerNow;

    @FindBy(xpath = "//input[@id='corporate']")
    public WebElement buttonTiklama;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement userName;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//input[@id='confirmPassword']")
    public WebElement confirmPassword;


    @FindBy(xpath = "(//h2)[7]")
    public WebElement assert1;



    @FindBy(xpath = "//input[@id='firstName']")
    public WebElement firstName;

    @FindBy(xpath = "//input[@id='lastName']")
    public WebElement lastName;

    @FindBy(xpath = "//input[@id='user.attributes.jobTitle']")
    public WebElement jobTitle;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement email;

    @FindBy(xpath = "(//input[@type='text'])[6]")
    public WebElement phoneNumber;


    @FindBy(xpath = "(//h2)[9]")
    public WebElement assert2;


    @FindBy(xpath = "//input[@id='user.attributes.company']")
    public WebElement CompanyName;

    @FindBy(xpath = "//select[@id='user.attributes.country']")
    public WebElement country;

    @FindBy(xpath = "//input[@id='user.attributes.addressLine1']")
    public WebElement adress1;

    @FindBy(xpath = "//input[@id='user.attributes.addressLine2']")
    public WebElement adress2;

    @FindBy(xpath = "//input[@id='user.attributes.addressLine3']")
    public WebElement adress3;

    @FindBy(xpath = "//input[@id='user.attributes.addressLine4']")
    public WebElement adress4;

    @FindBy(xpath = "//input[@id='user.attributes.addressPostalCode']")
    public WebElement postaCode;

    @FindBy(xpath = "//input[@id='user.attributes.addressCityText']")
    public WebElement city;

    @FindBy(xpath = "//input[@id='user.attributes.addressStateText']")
    public WebElement state;

    @FindBy(xpath = "//input[@id='user.attributes.addressCountyText']")
    public WebElement country2;

    @FindBy(xpath = "//button[@id='register-show-step2']")
    public WebElement createButton;





}
