package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class T1_Alert_Practices {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        WebDriverFactory.maximize(driver);
        WebDriverFactory.implicitlyWait(driver);
    }

    @Test
    public void alert_test1(){

        driver.get("https://practice.cydeo.com/javascript_alerts");

        WebElement clickForJSAlert = driver.findElement(By.xpath("//button[.='Click for JS Alert']"));

        clickForJSAlert.click();

        Alert alert = driver.switchTo().alert();

        alert.dismiss();

        WebElement resultText = driver.findElement(By.xpath("//p[.='You successfully clicked an alert']"));

        Assert.assertTrue(resultText.isDisplayed(),"Result text is NOT displayed.");

        String expectedText = "You successfully clicked an alert";
        String actualText = resultText.getText();

        Assert.assertEquals(actualText, expectedText, "Actual result text is not as expected!!!");

        }
}
