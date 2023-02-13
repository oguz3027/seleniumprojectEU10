package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DropdownPractices {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        WebDriverFactory.maximize(driver);
        WebDriverFactory.implicitlyWait(driver);
    }

    @Test
    public void dropdown_task5() throws InterruptedException {

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

    @Test
    public void dropdown_task6(){

        driver.get("http://practice.cybertekschool.com/dropdown");

        Select yearDropdown = new Select(driver.findElement(By.xpath("//select[@id='year']")));
        Select monthDropdown = new Select(driver.findElement(By.xpath("//select[@id='month']")));
        Select dayDropdown = new Select(driver.findElement(By.xpath("//select[@id='day']")));

        yearDropdown.selectByVisibleText("1924");
        monthDropdown.selectByValue("11");
        dayDropdown.selectByIndex(0);

        String actualYear = yearDropdown.getFirstSelectedOption().getText();
        String expectedYear = "1924";
        String actualMonth = monthDropdown.getFirstSelectedOption().getText();
        String expectedMonth = "December";
        String actualDay = dayDropdown.getFirstSelectedOption().getText();
        String expectedDay = "1";

        Assert.assertEquals(actualYear,expectedYear,"FAILED");
        Assert.assertEquals(actualMonth,expectedMonth,"FAILED");
        Assert.assertEquals(actualDay,expectedDay,"FAILED");

    }

    @AfterMethod
    public void tearDownMethod(){
        driver.close();
    }


}
