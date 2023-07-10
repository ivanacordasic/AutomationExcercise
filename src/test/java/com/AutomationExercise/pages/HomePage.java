package com.AutomationExercise.pages;

import com.AutomationExercise.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//a[.=' Signup / Login']")
    public WebElement signupLoginButton;

    @FindBy(xpath = "//a[contains(text(), 'Logged in as')]")
    public WebElement userButton;

    @FindBy(xpath = "//a[@href='/delete_account']")
    public WebElement deleteAccButton;

    @FindBy(xpath = "//b[.='Account Deleted!']")
    public WebElement accDeletedMessage;

    @FindBy (xpath = "//a[.='Continue']")
    public WebElement continueButton;


}
