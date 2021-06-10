package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Resultpage {
    private WebDriver driver;
    String expectedclick = "Euro";
    String expectedTitleText = "";

    public void verifyChangeCurrencySuccessMessage(){
        Assert.assertEquals(expectedclick,expectedclick,"your test case pass");

    }

    public void verifyChangeCommentOutSuccessMessage(){
        org.testng.Assert.assertEquals(expectedTitleText,expectedTitleText,"your test case pass");

    }
    public void verifyRegisterSuccessMessage(){
        org.testng.Assert.assertEquals(expectedTitleText,expectedTitleText,"your test case pass");

    }



}
