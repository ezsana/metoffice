package com.codecool.zsana.metoffice.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class KeywordRepository {

    private Properties properties;
    private FileInputStream propFile;
    private WebDriver chromeDriver;
    private Driver driver;
    private WebDriverWait wait;

    // with this, I have a driver open
    public KeywordRepository() {
        try {
            properties = new Properties();
            propFile = new FileInputStream("/home/zsana/Codecool/TESTAUTOMATION/metoffice/metoffice/src/test/resources/com/codecool/zsana/metoffice/metoffice.properties");
            properties.load(propFile);
        } catch (IOException e) {
            System.out.println(e.toString());
        }
        driver = new Driver();
        chromeDriver = driver.setupChromeDriver();
        wait = new WebDriverWait(chromeDriver, 10);
    }

    public void closeDriver() {
        if (chromeDriver != null) {
            chromeDriver.close();
            chromeDriver.quit();
        }
    }

    public void navigate(String url) {
        chromeDriver.navigate().to(url);
    }

    public void hoverOverElement(String elementPath) {

    }

    public void clickOnElement(String elementPath) {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(elementPath))).click();
    }

    public boolean isElementVisible(String elementPath) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(elementPath))).isDisplayed();
    }

    public Properties getProperties() {
        return properties;
    }

}
