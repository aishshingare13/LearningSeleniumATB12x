package com.thetestingacademy.ex_02_Selenium_Basics;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSelenium12_NoHTTP {
    public static void main(String[] args) {
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("bing.com");  //http is important
        driver.get("https://bing.com");
        driver.quit();
    }
}
