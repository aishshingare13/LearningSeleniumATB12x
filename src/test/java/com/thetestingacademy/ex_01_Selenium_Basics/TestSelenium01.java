package com.thetestingacademy.ex_01_Selenium_Basics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium01 {

    @Test
    public void test_Code(){
        Assert.assertEquals("Aishwarya","aishwarya");
    }
    @Test
    public void test_OpenVWOLoginPage(){
       //Open the VWO.com
        //FirefoxDriver driver = new FirefoxDriver();
        //ChromeDriver driver = new ChromeDriver();
        EdgeDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com");
        driver.quit();
    }
}
