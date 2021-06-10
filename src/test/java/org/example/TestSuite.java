package org.example;


import org.testng.annotations.Test;

public class TestSuite extends BaseTest {
    HomePage homePage = new HomePage();
    Resultpage resultpage =new Resultpage();



    @Test
    public void UsershouldAbleToChangeCurrencySuccesfully() {
        HomePage homePage = new HomePage();
        homePage.UserShouldBeToChangeCurrencySuccessfully();
        resultpage.verifyChangeCurrencySuccessMessage();

    }
    @Test
    public void userShouldBeAbleToCommentOutSuccessfully(){
        homePage.userShouldBeAbleToCommentOutSuccessfully();
        resultpage.verifyChangeCommentOutSuccessMessage();
    }
    @Test
    public void userShouldBeAbleToRegisterOutSuccessfully(){
        homePage.userShouldBeAbleToCommentOutSuccessfully();
        resultpage.verifyRegisterSuccessMessage();
    }
}