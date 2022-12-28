package com.cydeo.homeworks.day2_Homeworks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zero_Bank_Header_Verification {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("http://zero.webappsecurity.com/login.html");

        WebElement headerText = driver.findElement(By.className("page-header"));
        String actualHeaderText = headerText.getText();

        String expectedHeaderText = "Log in to ZeroBank";

        if (actualHeaderText.equals(expectedHeaderText)){
            System.out.println("PASSED");
        }else {
            System.out.println("FAILED");
        }

        driver.close();




    }
}
