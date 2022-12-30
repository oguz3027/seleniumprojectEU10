package com.cydeo.myPractices;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ETSY_Homework {
    public static void main(String[] args) {

        /*WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();*/

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.get("https://www.etsy.com");

        WebElement acceptButton = driver.findElement(By.cssSelector("button[class='']"));

        WebElement searchBar = driver.findElement(By.name("search_query"));
        searchBar.sendKeys("wooden spoon"+ Keys.ENTER);



        String actualTitle = driver.getTitle();
        String expectedTitle = "Wooden spoon | Etsy";


        if (actualTitle.equals(expectedTitle)){
            System.out.println("PASSED");
        }else {
            System.out.println("FAILED");
            System.out.println("actualTitle = " + actualTitle);
            System.out.println("expectedTitle = " + expectedTitle);
        }








    }
}
