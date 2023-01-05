package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_Selenium {
    WebDriver driver;
    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        WebDriverFactory.maximize(driver);
        WebDriverFactory.implicitlyWait(driver);
    }

    @AfterMethod
    public void tearDownMethod(){
        driver.close();
    }

    @Test
    public void selenium_test() {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        WebDriverFactory.maximize(driver);
        WebDriverFactory.implicitlyWait(driver);
        driver.get("https://www.google.com");
        String actualTitle = driver.getTitle();
        String expectedTitle = "Google";

        Assert.assertEquals(actualTitle, expectedTitle, "Title is not matching here");

    }
}
