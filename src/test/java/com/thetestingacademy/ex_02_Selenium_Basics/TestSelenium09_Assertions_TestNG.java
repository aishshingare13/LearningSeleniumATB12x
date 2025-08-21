package com.thetestingacademy.ex_02_Selenium_Basics;
import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

public class TestSelenium09_Assertions_TestNG {
    @Description("Open the URL")
    @Test
    public void test_Selenium01() {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://google.com");

        // TestNG
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.google.com/");
        // AssertJ Validation
        assertThat(driver.getCurrentUrl()).isNotBlank().isNotNull().isEqualTo("https://www.google.com/");

        driver.quit();
    }

    }
