package excelAutomation;

import org.apache.poi.ss.usermodel.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ExcelUtil;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class Day12_C12_ReadExcel {

    /*
    Import the apache poi dependency in your pom file
    resources package olustur > java altinda acilmali (java'ya sag tikla ve dosyayi olustur)
    Add the excel file on the resources folder
    Yeni package olustur: excelautomation
    Yeni class olustur : ReadExcel
    test method olustur: readExcel()
    Dosyanin adresini String olarak bir konteynira koy
    dosyayi ac
    fileinputstream kullanarak workbook'u ac
    ilk worksheet'i ac
    ilk row'a git
    ilk row'daki ilk cell'e git ve yazdir
    ilk row'daki ikinci cell'e git ve yazdir
    2nd row'daki ilk cell'e git ve datanin ABD'ye esit oldugunu assert e
    3rd row'daki 2nd cell-chain the row and cell
    row sayisini bul
    Kullanilan row sayisini bul
    Ulke ve baskent key-value ciftlerini map object olarak yazdir
    */
@Test
    public void ReadExcel() throws IOException {
    //Dosyanin adresini String olarak bir konteynira koy
    String path = "./src/test/java/resources/Baskent.xlsx";

    //dosyayi ac
    FileInputStream fileInputStream = new FileInputStream(path);

    //fileinputstream kullanarak workbook'u ac
    Workbook workbook = WorkbookFactory.create(fileInputStream);

    //ilk worksheet'i ac
    Sheet sheet = workbook.getSheetAt(0); //sheet sayfaları 0. index'ten başlar.

    //ilk row'a git
    Row ilkRow = sheet.getRow(0);//row'larda index 0 dan başlar.

    //ilk row'daki ilk cell'e git ve yazdir
    Cell ilkCell = ilkRow.getCell(0); // cell (hücre) indexi 0'dan başlar.
    System.out.println(ilkCell);

    //ilk row'daki ikinci cell'e git ve yazdir
    //1.yol
 /* Row row2 = sheet.getRow(1);
     Cell cell21 = row2.getCell(1);
    System.out.println(cell21);*/
    //2.yol
    Cell row1cell2 = sheet.getRow(4).getCell(1);
    System.out.println(row1cell2);

    Cell row2Cell1 = sheet.getRow(1).getCell(0);
    System.out.println("Data ABD olmali : "+row2Cell1);

    boolean esitMi = row2Cell1.toString().equals("ABD");
    Assert.assertTrue(esitMi);

    //3rd row'daki 2nd cell-chain the row and cell
    Cell row3Cell2 = sheet.getRow(2).getCell(1);
    System.out.println(row3Cell2);//Paris

    //row sayisini bul
   int rowSayisi = sheet.getLastRowNum()+1;
    System.out.println(rowSayisi);//11

    //Kullanilan row sayisini bul
  int kullanilanRowSayisi =  sheet.getPhysicalNumberOfRows();//kullanilanRowSayisinı bulur
    System.out.println(kullanilanRowSayisi);//11



    //Ulke ve baskent key-value ciftlerini map object olarak yazdir
    Map<String,String> dunyaBaskentleri = new HashMap<>();

    int ulkeColumn = 0;
    int baskentColumn = 1;

    //row numarasi 1den başlar cunku header 0. indextedir.
    // En sondaki row'Un indexi : lastRowNumber yada sheet.lastRowNumber()+1;

    for (int rownumarasi =1;rownumarasi<rowSayisi; rownumarasi++){
       String ulke =  sheet.getRow(rownumarasi).getCell(ulkeColumn).toString();
        String baskent =  sheet.getRow(rownumarasi).getCell(baskentColumn).toString();

        System.out.println("ulke : "+ ulke);
        System.out.println("baskent : "+baskent);
        dunyaBaskentleri.put(ulke,baskent);//Mep'e ulke ve baskentleri eklemiş olduk
    }
    System.out.println(dunyaBaskentleri);
    }

    @Test
    public void excelUtilDemo(){
        String path = "./src/test/java/resources/Baskent.xlsx";
        String sheetName ="Sayfa1";

        //Excell classı okumak için once bir nesne oluşturduk
        ExcelUtil excelUtil = new ExcelUtil(path,sheetName);
        //ExcelUtil deki methodlari çagirabiliriz.

        System.out.println(excelUtil.getDataList());

        System.out.println(excelUtil.columnCount());//2

        System.out.println(excelUtil.rowCount());//11

        System.out.println(excelUtil.getCellData(5,1));//ottowa

        System.out.println(excelUtil.getColumnsNames());//[Ulke, Baskent]









    }
}
