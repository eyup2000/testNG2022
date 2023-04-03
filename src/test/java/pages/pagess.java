package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class pagess {

    public pagess(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(id = "firstName")
    public WebElement firstName;

    @FindBy(id = "lastName")
    public WebElement lastName;

    @FindBy(id = "userEmail")
    public WebElement email;

    @FindBy(xpath = "(//div[@class='custom-control custom-radio custom-control-inline'])[2]")
    public WebElement gender;

    @FindBy(id = "dateOfBirthInput")
    public WebElement date;

    @FindBy(id = "subjectsContainer")
    public WebElement subject;

    @FindBy(xpath = "(//div[@class='custom-control custom-checkbox custom-control-inline'])[1]")
    public WebElement spor;

    @FindBy(xpath = "(//div[@class='custom-control custom-checkbox custom-control-inline'])[3]")
    public WebElement music;

    @FindBy(xpath ="//textarea[@id='currentAddress']")
    public WebElement address;

    @FindBy(xpath ="(//div[@class=' css-1hwfws3'])[1]")
    public WebElement state;

    @FindBy(xpath = "//input[@id='userNumber']")
    public WebElement phoneNumber;

    @FindBy(xpath = "(//div[@class='col-md-4 col-sm-12'])[2]")
    public WebElement city;

    @FindBy(xpath = "//button[@id='submit']")
    public WebElement button;

    @FindBy(xpath = "//input[@id='uploadPicture']")
    public WebElement dosyaSec;


}
