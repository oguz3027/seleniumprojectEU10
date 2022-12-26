package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T5_getText_getAttribute {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com/registration_form");

        WebElement headerText = driver.findElement(By.tagName("h2"));

        String actualHeaderText = headerText.getText();
        String expectedHeaderText = "Registration form";

        if (actualHeaderText.equals(expectedHeaderText)){
            System.out.println("Header text verification PASSED");
        }else{
            System.out.println("Header text verification FAILED");
        }

        WebElement firstNameInput = driver.findElement(By.name("firstname"));

        String actualPlaceHolder = firstNameInput.getAttribute("placeholder");
        String expectedPlaceHolder = "first name";

        if (actualPlaceHolder.equals(expectedPlaceHolder)){
            System.out.println("First name input verification PASSED");
        }else{
            System.out.println("First name input verification FAILED");
        }

        driver.close();

    }
}
