package com.thetestingacademy.ex_02_Selenium_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.io.File;

public class TestSelenium16_Mini_Project2_Add_Extension {
    @Description("Options class")
    @Test
    public void test_Selenium01()throws Exception{
        EdgeOptions chromeOptions = new EdgeOptions();
        chromeOptions.addArguments("--window-size=1920,1080"); //full HD

        chromeOptions.addExtensions(new File("src/test/java/com/thetestingacademy/ex_02_Selenium_Basics/AdBlock.crx"));
        WebDriver driver = new EdgeDriver(chromeOptions);
        driver.get("https://www.youtube.com/watch?v=BwTSxsAqlEc");
    }
}
