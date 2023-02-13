package com.cydeo.myPractices;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class Day5_T3 {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        WebDriverFactory.maximize(driver);
        WebDriverFactory.implicitlyWait(driver);
        clickAndVerifyRadioButton(driver, "sport", "hockey");

    }

    private static void clickAndVerifyRadioButton(WebDriver driver, String nameAttribute, String idValue) {

        driver.get("https://practice.cydeo.com/radio_buttons");

        List<WebElement> sportElement = driver.findElements(By.name(nameAttribute));

        for (WebElement each : sportElement) {

            String eachId = each.getAttribute("id");

            if (eachId.equals(idValue)) {
                each.click();
                System.out.println("each.isDisplayed() = " + each.isDisplayed());
                break;
            }

        }


    }
}
