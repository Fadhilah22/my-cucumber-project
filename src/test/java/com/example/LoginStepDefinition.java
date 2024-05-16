package com.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {

    @Given("I am on the login page")
    public void navigateToLoginPage() {
        // Code to navigate to the login page
    }

    @When("I enter my username and password")
    public void enterUsernameAndPassword() {
        // Code to navigate to the login page
    }

    @When("I click the login button")
    public void clickLoginButton() {
        // Code to click the login button
    }

    @Then("I should be logged into my account")
    public void verifyLoggedIn() {
        // Code to verify that the user is logged in
    }
}
