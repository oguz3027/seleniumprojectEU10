package com.cydeo.tests.day8_properties_config_reader;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T4_Config_Practice {

    WebDriver driver;
/*
    @BeforeMethod
    public void setupMethod(){

        //WebDriverFactory.setupMethod(driver);

        driver = WebDriverFactory.getDriver(ConfigurationReader.getProperty("browser"));
        WebDriverFactory.maximize(driver);
        WebDriverFactory.implicitlyWait(driver);

    }*/

    @Test
    public void google_search_test(){

        Driver.getDriver().get("https://google.com");
        WebElement googleSearchBox = Driver.getDriver().findElement(By.xpath("//input[@name='q']"));

        googleSearchBox.sendKeys(ConfigurationReader.getProperty("searchValue") + Keys.ENTER);

        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "apple - Google Search";

        Assert.assertEquals(actualTitle,expectedTitle);

    }


}
