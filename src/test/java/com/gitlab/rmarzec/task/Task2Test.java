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

        By mySelector = By.xpath("/html/body/div[4]/div[2]/nav[7]/div/ul");
        List<WebElement> myElements = webDriver.findElements(mySelector);
        for(WebElement e : myElements) {
            System.out.println(e.getText());
        }

        webDriver.findElement(By.xpath("/html/body/div[4]/div[2]/nav[7]/div/ul/li[30]/a/span")).click();
        String currentURL = webDriver.getCurrentUrl();
        System.out.println("Current Url is:"+ currentURL);



    }
}
