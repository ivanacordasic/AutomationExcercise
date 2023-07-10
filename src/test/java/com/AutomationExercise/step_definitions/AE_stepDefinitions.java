package com.AutomationExercise.step_definitions;

import com.AutomationExercise.pages.AccountCreatedPage;
import com.AutomationExercise.pages.HomePage;
import com.AutomationExercise.pages.LoginPage;
import com.AutomationExercise.pages.SignupPage;
import com.AutomationExercise.utilities.BrowserUtils;
import com.AutomationExercise.utilities.ConfigurationReader;
import com.AutomationExercise.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;



public class AE_stepDefinitions {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    SignupPage signupPage = new SignupPage();
    AccountCreatedPage accountCreatedPage = new AccountCreatedPage();

    @Given("Browser is launched")
    public void browser_is_launched() {

    }

    @When("User is on the Home page")
    public void user_is_on_the_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperties("HomePageURL"));
    }

    @When("User should be able to see Home Page")
    public void user_should_be_able_to_see_home_page() {
        BrowserUtils.titleVerification("Automation Exercise");
    }


    @When("User clicks on the Signup Login button")
    public void userClicksOnTheSignupLoginButton() {
        homePage.signupLoginButton.click();
    }

    @Then("User should be able to see {string} message on the page.")
    public void user_should_be_able_to_see_message_on_the_top_of_the_page(String message) {
        Assert.assertEquals(message, loginPage.newUserMessage.getText());
    }

    @When("User enters {string} and {string} address")
    public void userEntersAndAddress(String name, String email) {
        loginPage.insertNameAndEmail(name, email);
    }

    @When("User clicks on the Signup button")
    public void user_clicks_on_the_signup_button() {
        loginPage.signupButton.click();
    }

    @Then("User can see {string} message")
    public void user_can_see_message(String message) {
        Assert.assertEquals(message, signupPage.titleMessage.getText());
    }


    @When("User enters title {string}")
    public void userEntersTitle(String title) {
        signupPage.chooseATitle(title);
    }


    @And("User enters password {string}")
    public void userEntersPassword(String password) {
        signupPage.password.sendKeys(password);
    }

    @And("User enters day of birth {string}")
    public void userEntersDayOfBirth(String day) {
        signupPage.selectDateOfBirth("day", day);
    }

    @And("User enters month of birth {string}")
    public void userEntersMonthOfBirth(String month) {
        signupPage.selectDateOfBirth("month", month);
    }

    @And("User enters year of birth {string}")
    public void userEntersYearOfBirth(String year) {
        signupPage.selectDateOfBirth("year", year);
    }

    @When("User selects checkbox {string}")
    public void user_selects_checkbox(String string) {
        signupPage.chooseCheckbox(string);
    }

    @And("User enters first name {string}")
    public void userEntersFirstName(String firstName) {
        signupPage.firstName.sendKeys(firstName);
    }

    @And("User enters last name {string}")
    public void userEntersLastName(String lastName) {
        signupPage.lastName.sendKeys(lastName);
    }

    @And("User enters company {string}")
    public void userEntersCompany(String company) {
        signupPage.company.sendKeys(company);
    }

    @And("User enters address {string}")
    public void userEntersAddress(String address1) {
        signupPage.address1.sendKeys(address1);
    }

    @And("User enters address 2 {string}")
    public void userEntersAddress2(String address2) {
        signupPage.address2.sendKeys(address2);
    }

    @And("User enters country {string}")
    public void userEntersCountry(String countryName) {
        signupPage.chooseCountry(countryName);
    }

    @And("User enters state {string}")
    public void userEntersState(String state) {
        signupPage.state.sendKeys(state);
    }

    @And("User enters city {string}")
    public void userEntersCity(String city) {
        signupPage.city.sendKeys(city);
    }

    @And("User enters zip code {string}")
    public void userEntersZipCode(String zipCode) {
        signupPage.zipcode.sendKeys(zipCode);
    }

    @And("User enters mobile phone {string}")
    public void userEntersMobilePhone(String mobilePhone) {
        signupPage.mobile_number.sendKeys(mobilePhone);
    }

    @When("User clicks Create Account Button")
    public void userClicksCreateAcc_button() {
        BrowserUtils.clickWithJsExecutor(signupPage.createAccountButton);
    }

    @Then("User should be able to see {string} message")
    public void user_should_be_able_to_see_message(String message) {
        Assert.assertEquals(message, accountCreatedPage.accCreatedMessage.getText());
    }

    @When("User clicks Continue button")
    public void userClicksContinueButton() {
        accountCreatedPage.continueButton.click();
    }

    @Then("User should be able to see {string}")
    public void userShouldBeAbleToSee(String expectedText) {
        Assert.assertEquals(expectedText, homePage.userButton.getText());
    }

    @When("User clicks on the Delete Account button")
    public void user_clicks_on_the_DeleteAccButton() {
        homePage.deleteAccButton.click();
    }

    @Then("User should be able to see {string} message on the page")
    public void user_should_be_able_to_see_message_on_the_page(String message) {
        Assert.assertEquals(message, homePage.accDeletedMessage.getText());
    }

    @Then("User clicks Continue button.")
    public void user_clicks_button() {
        homePage.continueButton.click();
    }



}
