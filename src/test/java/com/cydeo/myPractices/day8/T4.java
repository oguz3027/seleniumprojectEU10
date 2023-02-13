package com.cydeo.myPractices.day8;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T4 {

    @Test
    public void test() {


        Driver.getDriver().get("http://www.google.com");

        WebElement searchBar = Driver.getDriver().findElement(By.xpath("//input[@class='gLFyf']"));

        searchBar.sendKeys(ConfigurationReader.getProperty("searchValue"), Keys.ENTER);

        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "apple - Google Search";

        Assert.assertEquals(actualTitle, expectedTitle);


    }


}

