package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class T6_StaleElemenReferenceException {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        WebDriverFactory.maximize(driver);
        WebDriverFactory.implicitlyWait(driver);
    }

    @Test
    public void test1(){

        driver.get("https://practice.cydeo.com/abtest");
        
        WebElement cydeo = driver.findElement(By.xpath("//a[@href='https://cydeo.com/']"));

        System.out.println(cydeo.isDisplayed());

        WebDriverFactory.refresh(driver);

        System.out.println(cydeo.isDisplayed());




    }

}
