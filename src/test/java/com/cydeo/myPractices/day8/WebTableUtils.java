package com.cydeo.myPractices.day8;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class WebTableUtils {
    public static String returnOrderDate (WebDriver driver, String costumerName){

        WebElement customer_name = Driver.getDriver().findElement(By.xpath("//table[@class='SampleTable']//td[.='"+ costumerName +"']/following-sibling::td[3]"));
        String customerOrderDate = customer_name.getText();

        return customerOrderDate;
    }


    public static void orderVerify (WebDriver driver,String costumerName,String expectedOrderDate){

        String actualOrderDate = returnOrderDate(Driver.getDriver(),costumerName);

        Assert.assertEquals(actualOrderDate, expectedOrderDate);

    }


}
