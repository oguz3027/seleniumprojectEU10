package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_CydeoVerifications {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com");

        Thread.sleep(2000);

        String expectedURL = "cydeo";
        String actualURL = driver.getCurrentUrl();

        if(actualURL.contains(expectedURL)){
            System.out.println("URL is as expected.Test PASSED");
        }else {
            System.err.println("URL is NOT as expected.Test FAILED");
        }

        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();
        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title is as expected.Test PASSED");
        }else {
            System.err.println("Title is NOT as expected.Test FAILED");
        }

        driver.close();



    }
}
