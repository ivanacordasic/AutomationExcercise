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


    /**
     * Bahruzs' method for marking the element you are working on. It is useful to use during Demo meetings
     * @param element
     */

    public void highLighterMethod(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid green;');",
                element);
    }

}
