package org.example;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import gherkin.formatter.model.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

import static com.sun.deploy.cache.Cache.copyFile;

public class Hooks extends Utils {
    BrowserSelector bowserSelector = new BrowserSelector();
    private BaseTest browserSelector;
    private String timestamp;


    @Before
    public void openBrowser() {
        browserSelector.OpenBrowser();
        driver.get("https://demo.nopcommerce.com/*");
    }

    @After
    public void closeBrowser(Scenario scenario) {
//        String screenshotName = scenario.getName().replaceAll(".,;:?!", "") + timestamp + ".png";
//        try {
//            if (!scenario.wait()) {
//            } else {
//                File sourcepath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//                File destinationPath = new File(System.getProperty("user.dir") + "/target/destination/screenshot/" + screenshotName);
//                try {
//                    copyFile(sourcepath, destinationPath);
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//                final String description = scenario.getDescription(("!!!!!!!!......Scenario Failed.......!!!!!!!!"));
//                scenario.getClass(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES), "image/png");
//            }
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        driver.quit();
    }
}




