package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Driver {
    private static WebDriver driver;
    /*
    getDriver()
    1- setup driver
    2- driver oluştur
    3-return driver
    *** Driver.getDriver()
     */

    public static WebDriver getDriver(){
        if (driver==null){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        }
        return driver;
    }
    private static void closeDriver(){
        if (driver!=null){ //eger driver bir yeri isaret ediyorsa veya kullaniliyorsa
            driver.close();
            driver=null; //driver null yap cunku surucu yeniden baslatabiliriz/çalıştırabiliriz
        }
    }
}
