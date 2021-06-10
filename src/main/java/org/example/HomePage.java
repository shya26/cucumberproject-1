package org.example;

import org.openqa.selenium.By;

public class HomePage extends Utils {

    public static void UserShouldBeToChangeCurrencySuccessfully(){
        ClickOnElement(By.cssSelector("Euro"));
    }



    public void userShouldBeAbleToCommentOutSuccessfully(){
        ClickOnElement(By.id("Title"));
        ClickOnElement(By.id("Comment"));

    }
    public void userShouldBeAbleToRegisterOutSuccessfully(){
        ClickOnElement(By.cssSelector("Register"));
    }
}