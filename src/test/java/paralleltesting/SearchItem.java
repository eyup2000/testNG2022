package paralleltesting;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import utilities.KullanisliMethodlar;

import java.util.concurrent.TimeUnit;

public class SearchItem {
    @Test
    public void googleSearch(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://www.google.com");
        KullanisliMethodlar.waitFor(2);
        System.out.println("Google Title : "+driver.getTitle());
        driver.findElement(By.name("q")).sendKeys("porcelain teapot"+ Keys.ENTER);
        driver.quit();
    }
    @Test
    public void ebaySearch(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://www.ebay.com");
        KullanisliMethodlar.waitFor(2);
        System.out.println("Resort line Title : "+driver.getTitle());
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("porcelain teapot"+Keys.ENTER);
        driver.quit();
    }
    @Test
    public void amazonSearch(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://www.amazon.com");
        KullanisliMethodlar.waitFor(2);
        System.out.println("Amazon Title : "+driver.getTitle());
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("porcelain teapot"+ Keys.ENTER);
        driver.quit();
    }
}

