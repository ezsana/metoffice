package com.codecool.zsana.metoffice.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

    private String driverPath = "/home/zsana/chromedriver_1.exe";

    public Driver() {
        System.setProperty("webdriver.chrome.driver", driverPath);
    }

    public WebDriver setupChromeDriver() {
        return new ChromeDriver();
    }

}
