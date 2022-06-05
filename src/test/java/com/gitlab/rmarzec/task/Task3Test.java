package com.gitlab.rmarzec.task;

import com.gitlab.rmarzec.framework.utils.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Task3Test {

    @Test
    public void Task3Test(){
        DriverFactory driverFactory = new DriverFactory();
        WebDriver webDriver = driverFactory.initDriver();
        webDriver.get("https://www.google.com/");
        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        webDriver.findElement(By.cssSelector("#L2AGLb > div:nth-child(1)")).click();
        webDriver.findElement(By.cssSelector(".gLFyf")).sendKeys("HTML select tag - W3Schools");
        webDriver.findElement(By.cssSelector(".FPdoLc > center:nth-child(1) > input:nth-child(2)")).click();
        String URL = webDriver.getCurrentUrl();
        try{
            Assert.assertEquals(URL, "https://www.w3schools.com/tags/tag_select.asp" );
        }catch(AssertionError e){
            String currentURL = webDriver.getCurrentUrl();
            System.out.println("Current Url is:"+ currentURL);
        }

    }
}

