package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_locators_getText {
    public static void main(String[] args) {

        //WebDriverManager.operadriver().setup();

        //WebDriver driver = new OperaDriver();

        WebDriver driver = WebDriverFactory.getDriver("edge");

        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com");

        WebElement userNameInput = driver.findElement(By.name("USER_LOGIN"));
        userNameInput.sendKeys("incorrect");

        WebElement passwordInput = driver.findElement(By.name("USER_PASSWORD"));
        passwordInput.sendKeys("incorrect");

        WebElement loginButton = driver.findElement(By.className("login-btn"));
        loginButton.click();

        String actualTxtMessage = driver.findElement(By.className("errortext")).getText();
        String expectedTxtMessage = "Incorrect login or password";

        if (actualTxtMessage.equals(expectedTxtMessage)){
            System.out.println("PASSED");
        }else {
            System.out.println("FAILED");
        }

        driver.close();






    }
}
