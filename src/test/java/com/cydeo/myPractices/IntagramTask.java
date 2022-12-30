package com.cydeo.myPractices;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class IntagramTask {
    public static void main(String[] args) throws InterruptedException {
        /*
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        */
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.google.com/");

        WebElement searchBar = driver.findElement(By.cssSelector("input[title='Ara']"));

        searchBar.sendKeys("instagram" + Keys.ENTER);

        WebElement instagramLink = driver.findElement(By.xpath("//a[@href='https://www.instagram.com/']"));

        instagramLink.click();

        WebElement usernameInput = driver.findElement(By.xpath("//input[@name='username']"));
        //usernameInput.click();
        usernameInput.sendKeys("jsdfbjsdfjk");

        WebElement passwordInput = driver.findElement(By.cssSelector("input[name='password']"));
        passwordInput.sendKeys("kfdjngkjn");

        WebElement loginButton = driver.findElement(By.cssSelector("div[class='_ab8w  _ab94 _ab99 _ab9f _ab9m _ab9p _abcm']"));
        loginButton.click();

        WebElement errorMessage = driver.findElement(By.xpath("//p[@id=\"slfErrorAlert\"]"));
        String actualErrorMessage = errorMessage.getText();
        String expectedErrorMessage = "Sorry, your password was incorrect. Please double-check your password.";

        if (actualErrorMessage.equals(expectedErrorMessage)){
            System.out.println("PASSED");
        }else {
            System.out.println("FAILED");
            System.out.println("actualErrorMessage   = " + actualErrorMessage);
            System.out.println("expectedErrorMessage = " + expectedErrorMessage);
        }




    }
}
