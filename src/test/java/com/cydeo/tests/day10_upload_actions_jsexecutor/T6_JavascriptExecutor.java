package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.tests.utilities.BrowserUtils;
import com.cydeo.tests.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class T6_JavascriptExecutor {

    @Test
    public void javascript_executor_test1() {

        Driver.getDriver().get("https://practice.cydeo.com/infinite_scroll");

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        for (int i = 0; i < 10; i++) {

            BrowserUtils.sleep(1);
            js.executeScript("window.scrollBy(0,750)");

        }

        for (int i = 0; i < 10; i++) {

            BrowserUtils.sleep(1);
            js.executeScript("window.scrollBy(0,-750)");

        }


    }

}
