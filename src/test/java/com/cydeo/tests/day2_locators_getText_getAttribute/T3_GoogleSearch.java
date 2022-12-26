package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_GoogleSearch {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver  = new ChromeDriver();
        driver.get("https://www.google.com");

        WebElement googleSearchBox = driver.findElement(By.name("q"));

        googleSearchBox.sendKeys("apple"+ Keys.ENTER);

        String actualTitle = driver.getTitle();
        String expectedTitle = "apple";

        if(actualTitle.startsWith(expectedTitle)){
            System.out.println("Google search verification PASSED");
        }else{
            System.out.println("Google search verification FAILED");
        }







    }
}
