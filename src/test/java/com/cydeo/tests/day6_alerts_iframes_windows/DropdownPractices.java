package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropdownPractices {

    @Test
    public void dropdown_task5() throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        WebDriverFactory.maximize(driver);
        WebDriverFactory.implicitlyWait(driver);

        driver.get("http://practice.cybertekschool.com/dropdown");

        Select simpleDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));
        Thread.sleep(2000);
        simpleDropdown.selectByVisibleText("Illinois");
        Thread.sleep(2000);
        simpleDropdown.selectByValue("VA");
        Thread.sleep(2000);
        simpleDropdown.selectByIndex(5);

        String actualState = simpleDropdown.getFirstSelectedOption().getText();
        String expectedState = "California";

        Assert.assertEquals(actualState,expectedState,"FAILED");










    }
}
