package com.AutomationExercise.pages;

import com.AutomationExercise.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountCreatedPage {

    public AccountCreatedPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//b[.='Account Created!']")
    public WebElement accCreatedMessage;

    @FindBy(xpath = "//a[.='Continue']")
    public WebElement continueButton;


}
