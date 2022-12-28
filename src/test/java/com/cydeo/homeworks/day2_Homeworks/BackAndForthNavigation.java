package com.cydeo.homeworks.day2_Homeworks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackAndForthNavigation {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://google.com");

        WebElement gmailButon = driver.findElement(By.className("gb_j"));

        gmailButon.click();
        String actualTitle = driver.getTitle();
        String expectedTitle = "Gmail";

        if (actualTitle.contains(expectedTitle)){
            System.out.println("Gmail PASSED");
        }else{
            System.out.println("Gmail FAILED");
        }

        driver.navigate().back();

        actualTitle = driver.getTitle();
        expectedTitle = "Google";

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Google PASSED");
        }else{
            System.out.println("Google FAILED");
        }

        driver.close();


    }
}
