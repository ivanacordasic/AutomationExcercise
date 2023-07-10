package com.AutomationExcercise.utilities;

import io.cucumber.java.sl.In;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Driver {

    private Driver(){}

    private static InheritableThreadLocal<WebDriver> poolDriver = new InheritableThreadLocal<>();

    public static WebDriver getDriver(){

        String browserType = ConfigurationReader.getProperties("browser");

        if (poolDriver.get() == null){

            switch (browserType){

                case "chrome":
                    poolDriver.set(new ChromeDriver());
                    poolDriver.get().manage().window().maximize();
                    poolDriver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                    break;

                case "firefox":
                    poolDriver.set(new FirefoxDriver());
                    poolDriver.get().manage().window().maximize();
                    poolDriver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                    break;

                case "headless-chrome":
                    ChromeOptions options = new ChromeOptions();
                    options.addArguments("--headless=new");
                    poolDriver.set(new ChromeDriver());
                    poolDriver.get().manage().window().maximize();
                    poolDriver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            }


        }

        return poolDriver.get();

    }


    public static void closeDriver(){

        if (poolDriver.get() != null){
            poolDriver.get().quit();
            poolDriver.remove();
        }

    }



}
