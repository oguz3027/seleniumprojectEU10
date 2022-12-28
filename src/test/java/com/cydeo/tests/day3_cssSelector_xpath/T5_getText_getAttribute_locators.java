package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T5_getText_getAttribute_locators {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");

        WebElement userName = driver.findElement(By.cssSelector("input[name='USER_LOGIN']"));
        userName.sendKeys("Oğuz Kürşat");

        WebElement resetPasswordButton = driver.findElement(By.xpath("//*[@id='login-popup']/form/div[4]/button"));
        resetPasswordButton.click();

        WebElement txt = driver.findElement(By.xpath("//*[@id='login-popup']/form/div[2]"));
        String actualText = txt.getText();
        String expectedText = "Login or E-mail not found";

        if (actualText.equals(expectedText)){
            System.out.println("Text verification PASSED");
        }else {
            System.out.println("Text verification FAILED!!!");
        }

        driver.close();





    }
}
