package dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day14_C16_DataProvider1 {
    /*
   DataProvider ile test
   1- 2D object array donduren bir getData methodu oluştur
   2- getData()  ustunde @DataProvider anotation kullan

     */

    @DataProvider
    public Object[][] getData(){

//        Object [][] managerProfili = new Object[3][2];
//        managerProfili [0][0] = "manager";
//        managerProfili [0][1] = "Manager1!";

        Object [][] managerProfili ={ {"manager","Manager1!"},{"manager5","Manager5!"},{"manager12","Manager12!"}};

    return managerProfili;
    }

    @Test (dataProvider = "getData")
    public void managerInfo(String kullaniciAdi, String sifre){

        System.out.println("Kullanıcı adi : "+kullaniciAdi + "\nSifre : "+ sifre);

    }
}
