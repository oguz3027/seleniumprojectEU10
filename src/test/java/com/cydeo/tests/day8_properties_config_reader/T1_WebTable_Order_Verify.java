package com.cydeo.tests.day8_properties_config_reader;

import com.cydeo.tests.utilities.WebDriverFactory;
import com.cydeo.tests.utilities.WebTableUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class T1_WebTable_Order_Verify {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        WebDriverFactory.maximize(driver);
        WebDriverFactory.implicitlyWait(driver);
    }

    @Test
    public void order_name_verify_test() {
        driver.get("https://practice.cydeo.com/web-tables");

        WebElement bobMartinCell = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']"));
        Assert.assertEquals(bobMartinCell.getText(), "Bob Martin");

        WebElement dateOfOrderBobMartin = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']/following-sibling::td[3]"));
        Assert.assertEquals(dateOfOrderBobMartin.getText(), "12/31/2021");

    }

    @Test
    public void order_name_verify_test_2() {
        driver.get("https://practice.cydeo.com/web-tables");
        WebTableUtils.returnOrderDate(driver, "Bob Martin");
    }

    @Test
    public void order_name_verify_test_3() {
        driver.get("https://practice.cydeo.com/web-tables");
        WebTableUtils.orderVerify(driver, "Bart Fisher", "01/16/2022");
    }



}
