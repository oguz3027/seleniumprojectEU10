package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3_getAttribute_cssSelector {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com");

        WebElement loginButton = driver.findElement(By.cssSelector("input[value='Log In']"));
        String actualLoginButtonText = loginButton.getAttribute("value");
        String expectedLoginButtonText = "Log In";

        if (actualLoginButtonText.equals(expectedLoginButtonText)){
            System.out.println("PASSED");
        }else{
            System.out.println("FAILED");
        }

        driver.close();


    }
}
