package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class T5_StateSelect {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        WebDriverFactory.maximize(driver);
        WebDriverFactory.implicitlyWait(driver);
    }

    /*
        @AfterMethod
        public void closeDriver(){
            driver.close();
        }
    */
    @Test
    public void selectState() {
        driver.get("http://practice.cybertekschool.com/dropdown");

        Select stateSelection = new Select(driver.findElement(By.xpath("//select[@id='state']")));

        stateSelection.selectByVisibleText("Illinois");

        stateSelection.selectByValue("VA");

        stateSelection.selectByIndex(5);

        String actualSelectedOption = stateSelection.getFirstSelectedOption().getText();
        String expectedSelectedOption = "California1";

        Assert.assertEquals(actualSelectedOption, expectedSelectedOption, "FAILED");

    }

    @Test
    public void test2(){
        driver.get("http://practice.cybertekschool.com/dropdown");

        Select stateSelection = new Select(driver.findElement(By.xpath("//select[@id='state']")));

        stateSelection.selectByVisibleText("Illinois");

        stateSelection.selectByValue("VA");

        stateSelection.selectByIndex(5);

        String actualSelectedOption = stateSelection.getFirstSelectedOption().getText();
        String expectedSelectedOption = "California1";
        Assert.assertTrue(actualSelectedOption.equals(expectedSelectedOption),"FAILED");

    }
}
