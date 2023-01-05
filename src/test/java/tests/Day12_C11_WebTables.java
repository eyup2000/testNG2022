package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.DefaultPage;
import pages.HotelRoomsPage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

import static utilities.Driver.getDriver;

public class Day12_C11_WebTables {

    //    When kullanici application'da HotelRoom sayfasina gider
    // Log in https://www.carettahotel.com/
    // Hotel Management'e Click yapar
    // Hotel Rooms'a Click yapar
//    test method: entireTable() ve tum header'lari yazdir
//    test method: printRows() ve tum row'lari ile 4 row'daki elementi yazdir
//    test method: printCells() ve table body'dek' cells'lerin toplam sayilarini yazdir ve tum cell'leri yazdir
//    test method: printColumns() ve columns'larin toplam sayisini yazdir ve 5. column yazdir
//    test method: printData(int row, int column); Bu method veriline cell'i yazdirmali
//    ornek : printData(2,3); 2. row ve 3 column yazdirmali

    LoginPage loginPage = new LoginPage();
    DefaultPage defaultPage=new DefaultPage();
    HotelRoomsPage hotelRoomsPage = new HotelRoomsPage();

    @BeforeMethod
    public void setUp(){
        getDriver().get(ConfigReader.getProperty("app_url_login"));

        loginPage.advancedLink.click();
        loginPage.proceedLink.click();

        loginPage.userName.sendKeys(ConfigReader.getProperty("manager_username"));
        loginPage.password.sendKeys(ConfigReader.getProperty("manager_password"));
        loginPage.loginButton.click();

        //login basırlı oldugunu asserrt edin
        Assert.assertTrue(defaultPage.addUser.isDisplayed());

        //hotel management click yap
        defaultPage.hotelManagement.click();
        //hotel rooms clik et
        defaultPage.hotelRooms.click();

    }
    //    test method: entireTable() ve tum header'lari yazdir
    @Test
    public void entireTable(){
        System.out.println("Tum tablo");
        System.out.println("Tablo body");

     WebElement tablebody = getDriver().findElement(By.xpath("//table//tbody"));

       // System.out.println(tablebody.getText());

        //tum header'ları yazdır
       List <WebElement> tumHeader = Driver.getDriver().findElements(By.xpath("//th"));
        for (WebElement herheader:tumHeader) {
            System.out.print(herheader.getText()+ "  ");
        }
    }

    //    test method: printRows() ve tum row'lari ile 4 row'daki elementi yazdir
    @Test
    public void printRows(){
        int sayi=1;
        System.out.println("Print rows");
        List <WebElement> tumRows =  Driver.getDriver().findElements(By.xpath("//tbody//tr"));
        for (WebElement herRow:tumRows) {
            System.out.println("Satir " + sayi + " ==> " + herRow.getText());
            sayi++;
        }
        //4 row'daki elementi yazdir
     WebElement row4 =   Driver.getDriver().findElement(By.xpath("//tbody//tr[4]"));
        System.out.println("row 4 => "+row4.getText());

    }

//    test method: printCells() ve table body'dek' cells'lerin toplam sayilarini yazdir ve tum cell'leri yazdir
@Test
    public void printCells(){
    System.out.println("print Cells");
     List<WebElement> tumCells=  Driver.getDriver().findElements(By.xpath("//tbody//td"));
    System.out.println("Toplam cell sayisi => " + tumCells.size());

    //tum cell'leri yazdir
    int sayi = 1;
    for (WebElement herCell : tumCells) {
        System.out.println(sayi +" : " + herCell.getText());
        sayi++;
    }
    Driver.closeDriver();
}

//    test method: printColumns() ve columns'larin toplam sayisini yazdir ve 5. column yazdir
@Test
    public void printColumns(){
//columns'larin toplam sayisini yazdir
   List<WebElement> tumHeader = Driver.getDriver().findElements(By.xpath("//th"));
        int columsSayisi = tumHeader.size();
    System.out.println(columsSayisi+" column vardir");

    //5. column yazdir
   List<WebElement> column5Data = Driver.getDriver().findElements(By.xpath("//table//tbody//tr//td[5]"));

   int hucreNumarasi=1;
   for (WebElement herHucre : column5Data){
       System.out.println("Hucre "+hucreNumarasi+" : "+herHucre.getText());
       hucreNumarasi++;
   }

}
    //    test method: printData(int row, int column); Bu method veriline cell'i yazdirmali
@Test
    public void printData(int row,int column){
        Driver.getDriver().findElements(By.xpath(""));

}








}
