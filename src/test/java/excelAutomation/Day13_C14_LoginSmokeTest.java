package excelAutomation;

import pages.DefaultPage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ExcelUtil;

import java.util.List;
import java.util.Map;

public class Day13_C14_LoginSmokeTest {

    ExcelUtil excelUtil;

    //datayı key-value pairs seklinde ( username , password ) al
    // Bir map ===> Map<String,String> : {manger ,  Manager1!}
    //List Map ==> List<Map <String,String> :

    List<Map<String,String>> testData;
    //page object model
    LoginPage loginPage;
    DefaultPage defaultPage;

    public void SetUp(){
        Driver.getDriver().get(ConfigReader.getProperty("app_url_login"));
        loginPage = new LoginPage();

    }
}
