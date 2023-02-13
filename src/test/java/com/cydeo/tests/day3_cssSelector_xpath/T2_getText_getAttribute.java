package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_getText_getAttribute {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com");

        WebElement rememberMe = driver.findElement(By.className("login-item-checkbox-label"));
        String actualrememberMeText = rememberMe.getText();
        String expectedrememberMeText = "Remember me on this computer";

        if (actualrememberMeText.equals(expectedrememberMeText)){
            System.out.println("Remember me verification PASSED");
        }else{
            System.out.println("Remember me verification FAILED!!!");
        }

        WebElement forgotPassword = driver.findElement(By.className("login-link-forgot-pass"));
        String actualForgotPasswordText = forgotPassword.getText();
        String expectedForgotPasswordText = "Forgot your password?";

        if (actualForgotPasswordText.equals(expectedForgotPasswordText)){
            System.out.println("Password verification PASSED");
        }else {
            System.out.println("Password verification FAILED!!!");
        }

        String hrefOfForgotPassword = forgotPassword.getAttribute("href");
        String expectedHREF = "forgot_password=yes";

        if (hrefOfForgotPassword.contains(expectedHREF)){
            System.out.println("Href attribute verification PASSED");
        }else {
            System.out.println("Href attribute verification FAILED!!!");
        }

        driver.close();



    }
}
