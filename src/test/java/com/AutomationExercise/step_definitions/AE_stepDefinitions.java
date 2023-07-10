package com.AutomationExercise.step_definitions;

import com.AutomationExercise.pages.HomePage;
import com.AutomationExercise.pages.LoginPage;
import com.AutomationExercise.pages.SignupPage;
import com.AutomationExercise.utilities.BrowserUtils;
import com.AutomationExercise.utilities.ConfigurationReader;
import com.AutomationExercise.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AutomationExercise_stepDefinitions {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    SignupPage signupPage = new SignupPage();
    Faker faker = new Faker();

    @Given("Browser is launched")
    public void browser_is_launched() {
        Driver.getDriver();
    }
    @When("User is on the Home page")
    public void user_is_on_the_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperties("HomePageURL"));
    }
    @When("User should be able to see Home Page")
    public void user_should_be_able_to_see_home_page() {
        BrowserUtils.titleVerification("Automation Exercise");
    }

    @When("User clicks on the Signup\\/Login button")
    public void userClicksOnTheSignupLoginButton() {
        homePage.signupLoginButton.click();
    }

    @Then("User should be able to see {string} message")
    public void user_should_be_able_to_see_message(String message) {
       Assert.assertTrue(loginPage.newUserMessage.isDisplayed());
    }
    @When("User enters name and email address")
    public void user_enters_name_and_email_address() {
        loginPage.name.sendKeys(faker.name()+"");
        loginPage.email.sendKeys(faker.internet().emailAddress());
    }
    @When("User clicks on the Signup button")
    public void user_clicks_on_the_signup_button() {
        loginPage.signupButton.click();
    }
    @When("User enters Title")
    public void user_enters_title() {

    }
    @When("User enters name")
    public void user_enters_name() {

    }
    @When("User enters email")
    public void user_enters_email() {

    }
    @When("User enters password")
    public void user_enters_password() {

    }
    @When("User enters Date of birth")
    public void user_enters_date_of_birth() {

    }
    @When("User selects checkbox {string}")
    public void user_selects_checkbox(String string) {

    }
    @When("User enters First name")
    public void user_enters_first_name() {

    }
    @When("User enters Last name")
    public void user_enters_last_name() {

    }
    @When("User enters Company")
    public void user_enters_company() {

    }
    @When("User enters Address")
    public void user_enters_address() {

    }
    @When("User enters Address2")
    public void user_enters_address2() {

    }
    @When("User enters Country")
    public void user_enters_country() {

    }
    @When("User enters State")
    public void user_enters_state() {

    }
    @When("User enters City")
    public void user_enters_city() {

    }
    @When("User enters Zipcode")
    public void user_enters_zipcode() {

    }
    @When("User enters Mobile phone")
    public void user_enters_mobile_phone() {

    }
    @When("User clicks {string} Button")
    public void user_clicks_button(String string) {

    }
    @When("User clicks {string} button")
    public void user_clicks_button(String string) {

    }
    @Then("User clicks {string} button")
    public void user_clicks_button(String string) {

    }



}
