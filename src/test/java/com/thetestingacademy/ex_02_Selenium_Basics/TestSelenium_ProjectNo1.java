package com.thetestingacademy.ex_02_Selenium_Basics;

import com.thetestingacademy.CommonToAll;
import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium_ProjectNo1  extends CommonToAll {

    @Test
    @Description("TC#1 Verify that a particular text exists on the Katalon website")
    public void test_verify_text(){
        //Open the URL
        //Get the source code
        //Verify the source code

        WebDriver driver = new FirefoxDriver();
        openBrowser(driver,"https://katalon-demo-cura.herokuapp.com");

        if (driver.getPageSource().contains("CURA Healthcare Service")){
            System.out.println("Test Case Passed");
            Assert.assertTrue(true);
        }else {
            System.out.println("Test case Failed");
            Assert.assertTrue(false);
        }
        closeBrowser(driver);



    }
}
