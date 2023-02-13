package com.cydeo.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

import java.util.concurrent.TimeUnit;

public class WebDriverFactory {
    public static WebDriver getDriver(String browserType) {

        if (browserType.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();
        } else if (browserType.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();

        } else if (browserType.equalsIgnoreCase("opera")) {
            WebDriverManager.operadriver().setup();
            return new OperaDriver();

        } else if (browserType.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            return new EdgeDriver();
        } else {
            System.out.println("Given browser type does not exist/or is not currently supported");
            System.out.println("Driver = null");
            return null;
        }
    }


    public static void maximize(WebDriver driver) {
        driver.manage().window().maximize();
    }

    public static WebDriver.Timeouts implicitlyWait(WebDriver driver){
        return driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    }

    public static void refresh(WebDriver driver){
        driver.navigate().refresh();
    }

    public static void setupMethod(WebDriver driver){
        driver = WebDriverFactory.getDriver(ConfigurationReader.getProperty("browser"));
        WebDriverFactory.maximize(driver);
        WebDriverFactory.implicitlyWait(driver);
    }



}
