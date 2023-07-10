package com.AutomationExercise.pages;

import com.AutomationExercise.utilities.Driver;
import io.cucumber.java.eo.Se;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.nio.channels.SeekableByteChannel;

public class SignupPage {

    public SignupPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//b[.='Enter Account Information']")
    public WebElement titleMessage;

    @FindBy(xpath = "//input[@value='Mr']")
    public WebElement mrTitleButton;

    @FindBy(xpath = "//input[@value='Mrs']")
    public WebElement mrsTitleButton;

    @FindBy(id = "name")
    public WebElement name;

    @FindBy(id = "email")
    public WebElement email;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(id = "days")
    public WebElement day;

    @FindBy(id = "months")
    public WebElement month;

    @FindBy(id = "years")
    public WebElement year;

    @FindBy(id = "optin")
    public WebElement specialOffers;

    @FindBy(id = "newsletter")
    public WebElement newsletter;

    @FindBy(id = "first_name")
    public WebElement firstName;

    @FindBy(id = "last_name")
    public WebElement lastName;

    @FindBy(id = "company")
    public WebElement company;

    @FindBy(id = "address1")
    public WebElement address1;

    @FindBy(id = "address2")
    public WebElement address2;

    @FindBy(id = "country")
    public WebElement country;

    @FindBy(id = "state")
    public WebElement state;

    @FindBy(id = "city")
    public WebElement city;

    @FindBy(id = "zipcode")
    public WebElement zipcode;

    @FindBy(id = "mobile_number")
    public WebElement mobile_number;

    @FindBy(xpath = "//form/button")
    public WebElement createAccountButton;

    @FindBy(xpath = "//iframe[@id='aswift_1']")
    public WebElement iframe;

    public void chooseATitle(String title){
        if (title.equals("Mr.")){
            mrTitleButton.click();
        }else if (title.equals("Mrs.")){
            mrsTitleButton.click();
        }
    }

    public void selectDateOfBirth(String dayMonthYear, String data){
        if (dayMonthYear.equals("day")){
            Select select = new Select(day);
            select.selectByVisibleText(data);
        }else if(dayMonthYear.equals("month")){
            Select select = new Select(month);
            select.selectByVisibleText(data);
        }else  {
            Select select = new Select(year);
            select.selectByVisibleText(data);
        }
    }

    public void chooseCheckbox(String text){
        if (text.equals("Sign up for our newsletter!")){
            newsletter.click();
        }else{
            specialOffers.click();
        }
    }

    public void chooseCountry(String countryName){
        Select select = new Select(country);
        select.selectByVisibleText(countryName);
    }



}
