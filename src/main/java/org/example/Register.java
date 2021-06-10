package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Register {
    protected static WebDriver driver;
    String expectedTitleText = "";

    @BeforeMethod
    public void OpenBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Soft\\chromedriver_win32 (1)\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com");

    }
    @Test
    public static void userShouldBeAbleToRegisterOutSuccessfully(){
        System.setProperty("webdriver.chrome.driver","C:\\Soft\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://demo.nopcommerce.com");
        driver.findElement(By.linkText("Register")).click();
        driver.findElement(By.id("FirstName")).sendKeys("shreya");
        driver.findElement(By.id("LastName")).sendKeys("trapasiya");
        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("shreyatrapasiya5@gmail.com");
        driver.findElement(By.id("password")).sendKeys("123456");
        driver.findElement(By.name("register - button")).click();
        try {
             Thread.sleep(2000);
         }catch (InterruptedException e){
             e.printStackTrace();

         }
        driver.quit();

    }

    @AfterMethod
    public void CloseBrowser(){
        driver.quit();
    }


}
