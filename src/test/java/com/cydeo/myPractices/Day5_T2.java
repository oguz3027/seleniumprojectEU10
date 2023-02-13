package com.cydeo.myPractices;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Day5_T2 {
    public static void main(String[] args) {


        WebDriver driver = WebDriverFactory.getDriver("chrome");
        WebDriverFactory.maximize(driver);
        WebDriverFactory.implicitlyWait(driver);

        driver.get("https://practice.cydeo.com/radio_buttons");

        WebElement hockeyRadioButton = driver.findElement(By.xpath("//input[@id='hockey']"));

        System.out.println("hockeyRadioButton.isSelected() = " + hockeyRadioButton.isSelected());

        hockeyRadioButton.click();

        System.out.println("hockeyRadioButton.isSelected() = " + hockeyRadioButton.isSelected());

    }
}
