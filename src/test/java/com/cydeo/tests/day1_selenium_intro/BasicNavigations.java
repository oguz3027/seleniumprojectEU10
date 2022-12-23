package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.tesla.com");

        driver.get("https://www.google.com");

        String currentTitle = driver.getTitle();
        String currentURL = driver.getCurrentUrl();
        System.out.println("currentTitle = " + currentTitle);
        System.out.println("currentURL = " + currentURL);




        Thread.sleep(2000);

        driver.navigate().back();

        Thread.sleep(2000);

        driver.navigate().forward();

        driver.navigate().refresh();

        driver.navigate().to("https://www.facebook.com");

        currentTitle = driver.getTitle();

        //System.out.println("driver.getTitle() = " + driver.getTitle());

        System.out.println("currentTitle = " + currentTitle);

        currentURL = driver.getCurrentUrl();

        System.out.println("currentURL = " + currentURL);

        driver.manage().window().fullscreen();

        driver.close();

        driver.quit();

    }
}
