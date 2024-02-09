package com.AutomationExercise.step_definitions;

import com.AutomationExercise.utilities.ConfigurationReader;
import com.AutomationExercise.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before("UI")
    public void setUpMethod(){
        Driver.getDriver().get(ConfigurationReader.getProperties("HomePageURL"));
    }

    @After ("@UI")
    public void tearDownMethod(Scenario scenario){

        if (scenario.isFailed()){
            byte [] screenshot = ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }

        Driver.closeDriver();

    }




}
