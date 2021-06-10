package org.example;

import org.openqa.selenium.By;

import javax.xml.soap.Text;

public class Utils extends Basepage {

    public static void ClickOnElement(By by){
        driver.findElement(by).click();
    }

    public static void enterText(By by,String text){
        driver.findElement(by).sendKeys(text);

    }



}
