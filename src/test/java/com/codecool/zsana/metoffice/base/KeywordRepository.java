package com.codecool.zsana.metoffice.base;

import org.openqa.selenium.WebDriver;

public class KeywordRepository {

    private WebDriver chromeDriver;
    private Driver driver;

    // with this, I have a driver open
    public KeywordRepository() {
        driver = new Driver();
        chromeDriver = driver.setupChromeDriver();
    }

    public void closeDriver() {
        if (chromeDriver != null) {
            chromeDriver.quit();
        }
    }

    public void navigate(String url) {
        chromeDriver.navigate().to(url);
    }

}
