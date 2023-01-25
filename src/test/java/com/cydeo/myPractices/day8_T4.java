package com.cydeo.myPractices;

import com.cydeo.tests.utilities.ConfigurationReader;
import com.cydeo.tests.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class day8_T4 {


    @Test
    public void test(){

        Driver.getDriver().get("https://google.com");

        WebElement searchBox = Driver.getDriver().findElement(By.xpath("//input[@class='gLFyf']"));
        searchBox.sendKeys(ConfigurationReader.getProperty("searchValue") + Keys.ENTER);

        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "apple - Google'da Ara";

        Assert.assertEquals(actualTitle,expectedTitle);






    }

}
