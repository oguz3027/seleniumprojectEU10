package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_RadioButton {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        WebDriverFactory.maximize(driver);

        WebDriverFactory.implicitlyWait(driver);

        driver.get("https://practice.cydeo.com/radio_buttons");

        WebElement hockeyButton = driver.findElement(By.xpath("//input[@id='hockey']"));

        System.out.println("hockeyButton.isSelected() = " + hockeyButton.isSelected());

        hockeyButton.click();

        System.out.println("hockeyButton.isSelected() = " + hockeyButton.isSelected());

        if(hockeyButton.isSelected()){
            System.out.println("Button is selected. Verification PASSED");
        }else{
            System.out.println("Button is not selected. Verification FAILED");
        }

    }
}
