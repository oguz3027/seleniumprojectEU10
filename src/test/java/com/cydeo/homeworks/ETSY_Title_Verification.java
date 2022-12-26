package com.cydeo.homeworks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ETSY_Title_Verification {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.etsy.com");

        WebElement searchBox = driver.findElement(By.name("search_query"));

        searchBox.sendKeys("Wooden spoon"+ Keys.ENTER);

        String actualTitle = driver.getTitle();
        String expectedTitle = "Wooden spoon - Etsy";

        if(actualTitle.contains(expectedTitle)){
            System.out.println("Title verification PASSED");
        }else {
            System.out.println("Title verification FAILED");
        }

        driver.close();


    }
}
