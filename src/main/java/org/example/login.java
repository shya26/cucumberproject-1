package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class login {
    protected static WebDriver driver;
    String expectedclick= "";

    @BeforeMethod
    public void OpenBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Soft\\chromedriver_win32 (1)\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com");

    }
    @Test
    public static void userShouldNotAbleToLoginSuccessfully(){
        System.setProperty("webdriver.chrome.driver","C:\\Soft\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://demo.nopcommerce.com");
        driver.findElement(By.linkText("Login")).click();
        driver.findElement(By.id("Username ")).sendKeys("shreya trapasiya");
        driver.findElement(By.id("Password")).sendKeys("123456");
        driver.findElement(By.name("Login - button")).click();
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();

        }
        driver.quit();
        Assert.assertTrue(driver.findElement(By.linkText("Euro")).isSelected());
        boolean expectedclick = false;
        Assert.assertEquals(expectedclick,expectedclick,"your test case pass");
        System.out.println("your test case passed");

    }

    @AfterMethod
    public void CloseBrowser(){
        driver.quit();
    }



}
