package excelAutomation;

import org.testng.annotations.Test;
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

//       if (loginPage.advancedLink.isDisplayed()){
//           loginPage.advancedLink.click();
//           loginPage.proceedLink.click();
//       }
       try{
           loginPage.advancedLink.click();
           loginPage.proceedLink.click();
       }catch (Exception e){
           System.out.println("Advenced linki görünmedi");
       }

    }
    @Test
    public void adminLoginTest(){
        //1.yol
 //       SetUp();
//        loginPage.userName.sendKeys(ConfigReader.getProperty("admin_username"));
//        loginPage.password.sendKeys(ConfigReader.getProperty("admin_password"));
//        loginPage.loginButton.click();

        //2.yol
//        SetUp();
//        loginPage.userName.sendKeys("manager");
//        loginPage.password.sendKeys("Manager1!");
//        loginPage.loginButton.click();

        //3.yol
        String path ="./src/test/java/resources/smoketestdata.xlsx";
        String sheetName = "admin_login_info";

        excelUtil = new ExcelUtil(path,sheetName);

        testData =  excelUtil.getDataList();

        System.out.println(testData);//[{password=Arcane123!, username=admin}]



        for (Map<String,String> herData : testData){
            SetUp();
        loginPage.userName.sendKeys(herData.get("username"));
        loginPage.password.sendKeys(herData.get("password"));
        loginPage.loginButton.click();
        }




    }
    @Test
    public void managerLoginTest(){
        String path ="./src/test/java/resources/smoketestdata.xlsx";
        String sheetName = "manager_login_info";

        excelUtil = new ExcelUtil(path,sheetName);

        testData =  excelUtil.getDataList();

        System.out.println(testData);///[{password=Manager1!, username=manager}, {password=Manager5!, username=manager5}, {password=Manager12!, username=manager12}]


        for (Map<String,String> herData : testData){
            SetUp();
            loginPage.userName.sendKeys(herData.get("username"));
            loginPage.password.sendKeys(herData.get("password"));
            loginPage.loginButton.click();
        }


    }
}
