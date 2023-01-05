package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class T4_SimpleDropdowns {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        WebDriverFactory.maximize(driver);
        WebDriverFactory.implicitlyWait(driver);
    }

    @Test
    public void simpleDropdownTest(){

        driver.get("https://practice.cydeo.com/dropdown");

        Select simpleDropdown = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));

        WebElement currentlySelectedOption = simpleDropdown.getFirstSelectedOption();

        String actualSimpleDropdownText = currentlySelectedOption.getText();
        String expectedSimpleDropdownText = "Please select an option";

        Assert.assertEquals(actualSimpleDropdownText,expectedSimpleDropdownText,"It's not equal");

        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));

        String actualStateDropdownText = stateDropdown.getFirstSelectedOption().getText();
        String expectedStateDropdownText = "Select a State";

        Assert.assertEquals(actualStateDropdownText,expectedStateDropdownText);


    }
}
