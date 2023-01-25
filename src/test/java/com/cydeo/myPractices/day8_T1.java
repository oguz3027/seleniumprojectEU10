package com.cydeo.myPractices;

import com.cydeo.tests.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class day8_T1 {

    @Test
    public void test(){

        Driver.getDriver().get("https://practice.cydeo.com/web-tables");
        WebElement bobMartinName = Driver.getDriver().findElement(By.xpath("//td[.='Bob Martin']"));

        Assert.assertEquals(bobMartinName.getText(),"Bob Martin");

        WebElement dateOfBobMartinOrder = Driver.getDriver().findElement(By.xpath("//td[.='Bob Martin']/following-sibling::td[3]"));

        Assert.assertTrue(dateOfBobMartinOrder.getText().equals("12/31/2021"));



    }
}
