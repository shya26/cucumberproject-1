package org.example;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class MyStepdefs {

    HomePage homePage = new HomePage();
    Register register = new Register();
    Resultpage resultpage = new Resultpage();




    @Given("^user is on registration page$")
    public void userIsOnRegistrationPage() {
        homePage.userShouldBeAbleToRegisterOutSuccessfully();
    }

    @When("^user enters all required registration details$")
    public void userEntersAllRequiredRegistrationDetails() {
        register.userShouldBeAbleToRegisterOutSuccessfully();

    }

    @Then("^User should able to register successfully$")
    public void userShouldAbleToRegisterSuccessfully() {
       resultpage.verifyRegisterSuccessMessage();}


    @Given("^user is on change currency$")
    public void userIsOnChangeCurrency() {
        homePage.UserShouldBeToChangeCurrencySuccessfully();

    }

    @When("^user enter own chose currency$")
    public void userEnterOwnChoseCurrency() {
        currency.UserShouldBeToChangeCurrencySuccessfully();

    }

    @Then("^user should able to change currency$")
    public void userShouldAbleToChangeCurrency() {
        resultpage.verifyChangeCurrencySuccessMessage();
    }

    @Given("^user is on get comment$")
    public void userIsOnGetComment() {
        homePage.userShouldBeAbleToCommentOutSuccessfully();
    }

    @When("^user enter they first comment out$")
    public void userEnterTheyFirstCommentOut() {
        comment.userShouldBeAbleToCommentOutSuccessfully();


    }

    @Then("^user should able to get comment$")
    public void userShouldAbleToGetComment() {
        resultpage.verifyChangeCommentOutSuccessMessage();
    }
}
