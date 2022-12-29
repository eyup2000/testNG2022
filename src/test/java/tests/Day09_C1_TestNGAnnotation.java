package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day09_C1_TestNGAnnotation {
    @BeforeMethod
    public void setUp(){
        System.out.println("Before method kullanıldı");
    }
    @AfterMethod
    public void tearDown(){
        System.out.println("After methodo kullanıldı");
    }
    @Test (priority = 1)
    public void test6(){
        System.out.println("test1");
    }
    @Test
    public void test2(){
        System.out.println("test2");
    }
    @Test
    public void test3(){
        System.out.println("test3");
    }
    @Test
    public void test4(){
        System.out.println("test4");
    }
}
