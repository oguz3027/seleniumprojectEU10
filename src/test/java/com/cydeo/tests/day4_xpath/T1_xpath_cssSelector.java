package com.cydeo.tests.day4_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_xpath_cssSelector {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/forgot_password");

        WebElement homeLink = driver.findElement(By.cssSelector("a[class='nav-link']"));
        System.out.println(homeLink.getText());
        System.out.println("homeLink.isDisplayed() = " + homeLink.isDisplayed());

        WebElement forgotPassword = driver.findElement(By.xpath("//div/div/div/h2"));
                                                                             //*[@id="content"]/div/h2
        System.out.println(forgotPassword.getText());
        System.out.println("forgotPassword.isDisplayed() = " + forgotPassword.isDisplayed());

        WebElement e_mail = driver.findElement(By.xpath("//label[@for='email']"));
        System.out.println(e_mail.getText());
        System.out.println("e_mail.isDisplayed() = " + e_mail.isDisplayed());

        WebElement e_mailText = driver.findElement(By.cssSelector("input[name='email']"));
        System.out.println(e_mailText.getText());
        System.out.println("e_mailText.isDisplayed() = " + e_mailText.isDisplayed());

        WebElement retrievePasswordButton = driver.findElement(By.xpath("//i[@class='icon-2x icon-signin']"));
        System.out.println(retrievePasswordButton.getText());
        System.out.println("retrievePasswordButton.isDisplayed() = " + retrievePasswordButton.isDisplayed());

        WebElement poweredByCydeo = driver.findElement(By.xpath("//div[@style='text-align: center;']"));
        System.out.println(poweredByCydeo.getText());
        System.out.println("poweredByCydeo.isDisplayed() = " + poweredByCydeo.isDisplayed());


    }
}
