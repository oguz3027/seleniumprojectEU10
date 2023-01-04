package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class T3_RadioButton_cont {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        WebDriverFactory.maximize(driver);

        WebDriverFactory.wait(driver);

        driver.get("https://practice.cydeo.com/radio_buttons");

        clickAndVerifyRadioButton(driver, "sport", "hockey");

        System.out.println("--------------------------------------");

        clickAndVerifyRadioButton(driver, "sport", "football");

        System.out.println("--------------------------------------");

        clickAndVerifyRadioButton(driver, "color", "yellow");

    }

    private static void clickAndVerifyRadioButton(WebDriver driver, String nameAttribute, String idValue
    ) {

        List<WebElement> radioButtons = driver.findElements(By.name(nameAttribute));

        for (WebElement each : radioButtons) {

            String eachId = each.getAttribute("id");

            System.out.println("eachId = " + eachId);

            if (eachId.equals(idValue)) {
                each.click();
                System.out.println(idValue + " is selected : " + each.isSelected());
                break;
            }


        }

    }
}
