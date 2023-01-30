package com.cydeo.myPractices.day8;

import com.cydeo.tests.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1 {

    @Test
    public void test (){
        Driver.getDriver().get("https://practice.cydeo.com/web-tables");

        WebElement bobMartin = Driver.getDriver().findElement(By.xpath("//table[@class='SampleTable']//td[.='Bob Martin']"));

        String actualName = bobMartin.getText();
        String  expectedName = "Bob Martin";

        Assert.assertEquals(actualName, expectedName);

        WebElement bobMartinOrderDate = Driver.getDriver().findElement(By.xpath("//table[@class='SampleTable']//td[.='Bob Martin']/following-sibling::td[3]"));

        String actualNameOrderDate = bobMartinOrderDate.getText();
        String  expectedNameOrderDate = "12/31/2021";

        Assert.assertEquals(actualName,expectedName);


    }
    
    @Test
    public void test2 (){

        Driver.getDriver().get("https://practice.cydeo.com/web-tables");
        WebTableUtils.returnOrderDate(Driver.getDriver(),"John Doe");

    }

    @Test
    public void test3 (){
        Driver.getDriver().get("https://practice.cydeo.com/web-tables");
        WebTableUtils.orderVerify(Driver.getDriver(),"Ned Stark","05/12/2021");
    }

}
