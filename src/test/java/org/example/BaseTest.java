package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utils {

    @BeforeMethod
    public void OpenBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Soft\\chromedriver_win32 (1)\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com");

    }
    @AfterMethod
    public void CloseBrowser(){
        driver.quit();
    }

    {
    }


}
