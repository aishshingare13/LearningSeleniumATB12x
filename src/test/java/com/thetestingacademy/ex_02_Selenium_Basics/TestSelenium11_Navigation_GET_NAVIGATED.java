package com.thetestingacademy.ex_02_Selenium_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestSelenium11_Navigation_GET_NAVIGATED {
    @Description("Opne the URL")
    @Test
    public void test_Selenium01(){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://google.com");

        //use Navigation Commands
        //driver.get("url") -> Navigate to url

        //use navigation methods
        driver.navigate().to("https://bing.com");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();
    }
}
