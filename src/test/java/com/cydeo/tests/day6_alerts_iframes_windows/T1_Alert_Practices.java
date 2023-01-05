package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class T1_Alert_Practices {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        WebDriverFactory.maximize(driver);
        WebDriverFactory.implicitlyWait(driver);
    }

    @Test
    public void alert_test1(){




    }
}
