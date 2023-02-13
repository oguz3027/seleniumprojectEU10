package com.cydeo.myPractices.day8;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T3 {

    @Test
    public void test() {

        Driver.getDriver().get("https://practice.cydeo.com/tables");

        getTableGetEmail(Driver.getDriver(), "table1", "Jason");


    }

    public static void getTableGetEmail(WebDriver driver, String tableNum, String firstName) {

        WebElement email = Driver.getDriver().findElement(By.xpath("//table[@id='" + tableNum + "']//td[.='" + firstName + "']/following-sibling::td[1]"));

        System.out.println(email.getText());


    }


}
