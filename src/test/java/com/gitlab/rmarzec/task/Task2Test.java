package com.gitlab.rmarzec.task;

import com.gitlab.rmarzec.framework.utils.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.List;


public class Task2Test {
    @Test
    public void Task2Test(){
        DriverFactory driverFactory = new DriverFactory();
        WebDriver webDriver = driverFactory.initDriver();
        webDriver.get("https://pl.wikipedia.org/wiki/Wiki");

        By mySelector = By.cssSelector("#p-lang > div:nth-child(3) > ul:nth-child(1)");
        List<WebElement> myElements = webDriver.findElements(mySelector);
        for(WebElement e : myElements) {
            System.out.println(e.getText());
        }

        webDriver.findElement(By.cssSelector("li.interlanguage-link:nth-child(30) > a:nth-child(1) > span:nth-child(1)")).click();
        String currentURL = webDriver.getCurrentUrl();
        System.out.println("Current Url is:"+ currentURL);



    }
}
