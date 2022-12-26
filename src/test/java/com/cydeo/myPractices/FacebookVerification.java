package com.cydeo.myPractices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookVerification {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https:www.facebook.com");

        //driver.findElement(By.xpath("//button[@title='Allow essential and optional cookies']")).click();
        WebElement eposta = driver.findElement(By.name("email"));
        eposta.sendKeys("ssfz");

        WebElement password = driver.findElement(By.name("pass"));
        password.sendKeys("ssffz");

        driver.findElement(By.name("login")).click();

        Thread.sleep(3000);

        WebElement yesButton = driver.findElement(By.className("_39g9"));

        yesButton.click();

        Thread.sleep(15000);
        WebElement loginForm = driver.findElement(By.id("loginform"));
        WebElement textResult = loginForm.findElement(By.className("_9ay7"));
        String actualResult = textResult.getText();

        String expectedResult = "The email address or mobile number you entered isn't connected to an account.";


        if (actualResult.contains(expectedResult)) {
            System.out.println("PASSED!");
        } else {
            System.out.println("FAILED!");
        }

    }
}