package com.cydeo.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class Driver {

    private Driver() {}

    private static WebDriver driver;

    public static WebDriver getDriver() {

        if (driver == null) {

            String browserType = ConfigurationReader.getProperty("browser");

            switch (browserType){
                case "chrome":

                    ChromeOptions options = new ChromeOptions();
                    Map<String, Object> prefs = new HashMap<String, Object>();
                    prefs.put("intl.accept_languages", "en-GB");
                    options.setExperimentalOption("prefs", prefs);
                    WebDriverManager.chromedriver().setup();
                    //WebDriver driver = new ChromeDriver(options);
                    driver = new ChromeDriver(options);
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;
                case "edge":
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;
                case "opera":
                    WebDriverManager.operadriver().setup();
                    driver = new OperaDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;

            }
        }

        return driver;
    }

    public static void closeDriver(){
        if(driver != null){
            driver.quit();
            driver = null;
        }
    }


}
