package com.cydeo.myPractices;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AssertClass {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("edge");
        WebDriverFactory.maximize(driver);
        WebDriverFactory.implicitlyWait(driver);
    }

    @Test
    public void testAssert() throws InterruptedException {

        driver.get("https://automationexercise.com/%22");

        //1. verify that home page is visible successfully
        String expectedURL = "https://automationexercise.com/";

        String actualURL = driver.getCurrentUrl();

        Assert.assertEquals(actualURL, expectedURL);

        //2. click on 'Products' button
        driver.findElement(By.xpath("//a[@href='/products']")).click();

        driver.navigate().refresh();
/*
        //3. Verify user is navigated to ALL PRODUCTS page successfully
        WebElement allProductYaziElementi = driver.findElement(By.xpath("//h2[@class='title text-center']"));
        Assert.assertTrue(allProductYaziElementi.isDisplayed());


        //4. The products list visible
        List<WebElement> productList = driver.findElements(By.xpath("//h2[@class='title text-center']"));
        Assert.assertTrue(productList.size() > 0);
*/


        //5. click on 'View Product' of first product
        WebElement viewProduct = driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div[1]/div[2]/div/div[2]"));
        viewProduct.click();
/*
        //6. User is landed to product detail
        WebElement productName = driver.findElement(By.xpath("//div[@class='product-information']"));
        Assert.assertTrue(productName.isDisplayed());

        //7. verify that detail is visible: product name, category
        WebElement categoryElement = driver.findElement(By.xpath("//*[text()='Category: Women > Tops']"));
        Assert.assertTrue(categoryElement.isDisplayed());

*/

    }

}
