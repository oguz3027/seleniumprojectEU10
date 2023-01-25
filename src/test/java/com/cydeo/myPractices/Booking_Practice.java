package com.cydeo.myPractices;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Booking_Practice {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        WebDriverFactory.maximize(driver);
        WebDriverFactory.implicitlyWait(driver);
    }

    @Test
    public void booking(){

        driver.get("https://www.booking.com");

        WebElement findYourHome = driver.findElement(By.xpath("//span[@data-testid='wcu_bh_banner_desktop--button']"));

        findYourHome.click();

        WebElement inputSearchBox = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div[2]/div/form/div/div[1]/div[1]/div[1]/label/input"));
        inputSearchBox.sendKeys("Egypt");

        WebElement feb02 = driver.findElement(By.xpath("//td[@data-date='2023-02-02']"));
        feb02.click();

        WebElement feb03 = driver.findElement(By.xpath("//td[@data-date='2023-02-03']"));
        feb03.click();

        WebElement searchButton = driver.findElement(By.xpath("//button[@class='sb-searchbox__button ']"));
        searchButton.click();




    }


}
