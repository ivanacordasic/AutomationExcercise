package com.AutomationExercise.utilities;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class BrowserUtils {

    public static void titleVerification(String expectedTitle){
        Assert.assertEquals(expectedTitle, Driver.getDriver().getTitle());
    }


    public static void clickWithJsExecutor(WebElement button){
        JavascriptExecutor js = (JavascriptExecutor)Driver.getDriver();
        js.executeScript("arguments[0].click();", button);
    }


}
