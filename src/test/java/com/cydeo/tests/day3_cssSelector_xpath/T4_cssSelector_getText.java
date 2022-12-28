package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T4_cssSelector_getText {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");

        WebElement resetPasswordButton = driver.findElement(By.cssSelector("button[class='login-btn']"));
        String actualResetPasswordButtonText = resetPasswordButton.getText();
        String expectedResetPasswordButtonText = "Reset password";

        if (actualResetPasswordButtonText.equals(expectedResetPasswordButtonText)){
            System.out.println("PASSED");
        }else{
            System.out.println("FAILED");
        }

        driver.close();



    }
}
