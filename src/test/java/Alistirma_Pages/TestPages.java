package Alistirma_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TestPages {
    public TestPages() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[@id='onetrust-reject-all-handler']")
    public WebElement cerezKabul;

    @FindBy(xpath = "//a[@class='logo']")
    public WebElement logoTest;

    @FindBy(xpath = "//a[@title='Otomobil']")
    public WebElement otomobilTikla;

    @FindBy(xpath = "//a[@title='BMW']")
    public WebElement BMWtikla;

    @FindBy(xpath = "//a[@title='3 Serisi']")
    public WebElement seri3;

    @FindBy(xpath = "//a[@title='İl']")
    public WebElement il;

    @FindBy(xpath = "(//a[@class='collapse-pane'])[1]")
    public WebElement carpiTiklama;

    @FindBy(xpath = "(//a[@title='2017 BMV 318D SEDEFLİ BEYAZ+KOLTUK ISITMA HATASIZ BOYASIZ'])[2]")
    public WebElement arabaSecme;

    @FindBy(className = "feature-discovery feature-discovery--visible")
    public WebElement aramaKaydet;
}
