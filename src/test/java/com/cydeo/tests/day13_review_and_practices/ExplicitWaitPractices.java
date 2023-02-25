package com.cydeo.tests.day13_review_and_practices;

import com.cydeo.pages.DynamicControlPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExplicitWaitPractices {

    DynamicControlPage dynamicControlPage;

    @BeforeMethod
    public void setupMethod(){
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_controls");
        dynamicControlPage = new DynamicControlPage();

    }

    @Test
    public void remove_button_test(){

        dynamicControlPage.removeButton.click();

        //Driver.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        //WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        //wait.until(ExpectedConditions.invisibilityOf(dynamicControlPage.loadingBar));

        BrowserUtils.waitForInvisibilityOf(dynamicControlPage.loadingBar);

        try {

            Assert.assertTrue(!dynamicControlPage.checkbox.isDisplayed());
            Assert.assertFalse(dynamicControlPage.checkbox.isDisplayed());

        }
        catch (NoSuchElementException n) {

            Assert.assertTrue(true);

        }

        Assert.assertTrue(dynamicControlPage.message.isDisplayed());
        Assert.assertTrue(dynamicControlPage.message.getText().equals("It's gone!"));


    }



}
