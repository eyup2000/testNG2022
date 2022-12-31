package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HotelRoomsPage {
    public HotelRoomsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(className = "hidden-480")
    public WebElement addHotelRoomLink;

    @FindBy(id = "IDHotel")
    public WebElement IdDropDown;

    @FindBy(id = "Code")
    public WebElement code;

    @FindBy(id = "Name")
    public WebElement name;

    @FindBy(id = "Location")
    public WebElement location;

    @FindBy(xpath = "//textarea[@dir='ltr']")
    public WebElement description;

    @FindBy(id = "Price")
    public WebElement price;

    @FindBy(id = "IDGroupRoomType")
    public WebElement roomTypeDropDown;

    @FindBy(id = "MaxAdultCount")
    public WebElement maxAdultCount;

    @FindBy(id = "MaxChildCount")
    public WebElement maxChildCount;

    @FindBy(id = "IsAvailable")
    public WebElement approvedCheckBox;

    @FindBy (id = "btnSubmit")
    public WebElement saveButton;
    @FindBy(xpath = "//li[@data-id='600']")
    public WebElement price600;

    @FindBy(className = "bootbox-body")
    public WebElement massage;
}
