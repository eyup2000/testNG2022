package dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ExcelUtil;

public class Day14_C18_DataProvider2 {

    @DataProvider
    public Object [][] getData(){
        String path ="./src/test/java/resources/smoketestdata.xlsx";
        String sheetName = "manager_login_info";

        ExcelUtil excelUtil = new ExcelUtil(path,sheetName);
        Object[][] managerProfili = excelUtil.getDataArrayWithoutFirstRow();

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
    public void managerLoginTest(String managerId , String managerSifre){
        setUp();
        loginPage.userName.sendKeys(managerId);
        loginPage.password.sendKeys(managerSifre);
        loginPage.loginButton.click();
    }
}
