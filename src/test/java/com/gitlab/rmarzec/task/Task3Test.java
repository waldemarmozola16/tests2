package com.gitlab.rmarzec.task;

import com.gitlab.rmarzec.framework.utils.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Task3Test {

    @Test
    public void Task3Test(){
        DriverFactory driverFactory = new DriverFactory();
        WebDriver driver = driverFactory.initDriver();
        driver.get("https://www.google.com/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("#L2AGLb > div:nth-child(1)")).click();
        driver.findElement(By.cssSelector(".gLFyf")).sendKeys("HTML select tag - W3Schools");
        driver.findElement(By.cssSelector(".FPdoLc > center:nth-child(1) > input:nth-child(2)")).click();
        String URL = driver.getCurrentUrl();
        try{
            Assert.assertEquals(URL, "https://www.w3schools.com/tags/tag_select.asp" );
        }catch(AssertionError e){
            String currentURL = driver.getCurrentUrl();
            System.out.println("Current Url is:"+ currentURL);
        }
        driver.findElement(By.cssSelector("#accept-choices")).click();
        driver.findElement(By.cssSelector("div.w3-example:nth-child(5) > a:nth-child(4)")).click();
        List<WebElement> headers = driver.findElements(By.xpath("/html/body/h1"));
        for (WebElement header : headers){
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", header);
            System.out.println(header.getText());
        }
        System.out.println(headers);
    }}
