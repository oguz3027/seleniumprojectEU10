package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooTask {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.yahoo.com");

        String actualtitle = driver.getTitle();
        String expextedTitle = "Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports & Videos";
        if(actualtitle.equals(expextedTitle)){
            System.out.println("Title is expected.Verification PASSED");
        }else {
            System.out.println("Title is NOT expected.Verification FAILED");
        }

    }
}
