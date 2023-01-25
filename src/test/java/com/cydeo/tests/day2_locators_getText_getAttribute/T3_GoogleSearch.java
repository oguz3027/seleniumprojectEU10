package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class T3_GoogleSearch {
    public static void main(String[] args) {


        ChromeOptions options = new ChromeOptions();
        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("intl.accept_languages", "en-GB");
        options.setExperimentalOption("prefs", prefs);
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.google.com");

        //WebDriver driver  = new ChromeDriver();
        //driver.get("https://www.google.com");

        WebElement googleSearchBox = driver.findElement(By.name("q"));

        googleSearchBox.sendKeys("apple"+ Keys.ENTER);

        String actualTitle = driver.getTitle();
        String expectedTitle = "apple - Google Search";

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Google search verification PASSED");
        }else{
            System.out.println("Google search verification FAILED");
        }







    }
}
