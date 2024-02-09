package com.AutomationExercise.step_definitions;

import com.AutomationExercise.pages.LoginPage;
import com.AutomationExercise.pages.SignupPage;
import com.AutomationExercise.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Map;

public class Test {

    LoginPage loginPage = new LoginPage();
    SignupPage signupPage = new SignupPage();

    @Given("user is on the Login Page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get("https://automationexercise.com/login");
    }

    @When("user enters name {string}")
    public void user_enters(String name) {
        loginPage.nameBox.sendKeys(name);
    }

    @And("user enters email {string}")
    public void userEntersEmail(String email) {
        loginPage.emailBox.sendKeys(email);
    }

//    @When("user clicks to the Signup button")
//    public void user_clicks_to_the_signup_button() {
//        loginPage.signupButton.click();
//    }

//    @Then("user should be directed to the sign up page")
//    public void user_should_be_directed_to_the_sign_up_page() {
//
//    }


    @Then("user clicks to the create account button")
    public void userClicksToTheCreateAccountButton() {
        signupPage.createAccountButton.click();
    }
}

