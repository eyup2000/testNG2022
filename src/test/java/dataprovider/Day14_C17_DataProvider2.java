package dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;

public class Day14_C17_DataProvider2 {

    /*
     Manager kullanici bilgileri ile login fonksiyonunu test et
     getData method'unda 2D array donduren bir object olustur
     */

    @DataProvider
    public Object[][] getData(){

        Object [][] managerProfili ={ {"manager","Manager1!"},{"manager5","Manager5!"},{"manager12","Manager12!"}};

        return managerProfili;
    }
    LoginPage loginPage;
    public void setUp(){
        loginPage = new LoginPage();
        Driver.getDriver().get(ConfigReader.getProperty("app_url_login"));
        try{
            loginPage.advancedLink.click();
            loginPage.proceedLink.click();
        }catch (Exception e){
            System.out.println("Advenced linki görünmedi");
        }

    }
    @Test(dataProvider = "getData")
    public void managerLoginTest(String kullaniciAdi , String sifre){
        setUp();
        loginPage.userName.sendKeys(kullaniciAdi);
        loginPage.password.sendKeys(sifre);
        loginPage.loginButton.click();
    }
}
