package com.AutomationExercise.pages;

import com.AutomationExercise.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy (xpath = "//h2[.='New User Signup!']")
    public WebElement newUserMessage;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement nameBox;

    @FindBy(xpath = "(//input[@name='email'])[2]")
    public WebElement emailBox;

    @FindBy(xpath = "//button[.='Signup']")
    public WebElement signupButton;

    public void insertNameAndEmail(String name, String email){
        nameBox.sendKeys(name);
        emailBox.sendKeys(email);
    }

}
