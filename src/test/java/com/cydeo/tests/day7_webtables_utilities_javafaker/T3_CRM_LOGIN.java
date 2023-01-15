package com.cydeo.tests.day7_webtables_utilities_javafaker;

import com.cydeo.tests.utilities.BrowserUtils;
import com.cydeo.tests.utilities.CRM_Utilities;
import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class T3_CRM_LOGIN {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        WebDriverFactory.maximize(driver);
        WebDriverFactory.implicitlyWait(driver);
    }

    @Test
    public void crm_login_test(){
        driver.get("https://login1.nextbasecrm.com");

        WebElement inputUserName = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        inputUserName.sendKeys("helpdesk1@cybertekschool.com");

        WebElement inputPassword = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        inputPassword.sendKeys("UserUser");

        WebElement loginButton = driver.findElement(By.xpath("//input[@class='login-btn']"));
        loginButton.click();

        BrowserUtils.verifyTitle(driver,"My tasks");

    }

    @Test
    public void crm_login_test_2(){
        driver.get("https://login1.nextbasecrm.com");

        CRM_Utilities.crm_login(driver);

        BrowserUtils.verifyTitle(driver,"My tasks");

    }

    @Test
    public void crm_login_test_3(){
        driver.get("https://login1.nextbasecrm.com");

        CRM_Utilities.crm_login(driver,"helpdesk1@cybertekschool.com","UserUser");

        BrowserUtils.verifyTitle(driver,"My tasks");

    }

}
