package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class comment {
    protected static WebDriver driver;
    private static boolean expectedTitleText;


    @BeforeMethod
    public void OpenBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Soft\\chromedriver_win32 (1)\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com");

    }
    @Test
    public static void userShouldBeAbleToCommentOutSuccessfully(){
        System.setProperty("webdriver.chrome.driver","C:\\Soft\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://demo.nopcommerce.com");
        driver.findElement(By.id("Title")).sendKeys("Test Comment");
        driver.findElement(By.id("Comment")).sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry.");
        Assert.assertTrue(driver.findElement(By.linkText("comment")).isDisplayed());
        Assert.assertEquals(expectedTitleText,expectedTitleText,"your test case pass");
        System.out.println("your test case passed");

    }

    @AfterMethod
    public void CloseBrowser(){
        driver.quit();
    }


}
