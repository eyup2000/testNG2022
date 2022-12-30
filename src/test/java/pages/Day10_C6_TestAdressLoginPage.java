package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Day10_C6_TestAdressLoginPage {
    //Bu sayfa page class
    //Bu class ta yanlizca page object ve onemli ana methotları ekleriz


    //1. constructor oluştur
    //pageFactory.initElements() bu page objectleri çaliştirir
    public Day10_C6_TestAdressLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //2.page(sayfadaki) elementleri bul/oluştur
    //note: 8 locatorin tumu kullanılabilir
    @FindBy (id = "ctl00_CPHContainer_txtUserLogin")
    public WebElement email;

    @FindBy (id = "ctl00_CPHContainer_txtPassword")
    public WebElement password;

    @FindBy (id = "ctl00_CPHContainer_btnLoginn")
    public WebElement loginButton;
}
