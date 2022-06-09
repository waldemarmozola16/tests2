package com.gitlab.rmarzec.task;

import com.gitlab.rmarzec.framework.utils.DriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import javax.xml.bind.annotation.XmlList;
import java.util.List;


public class Task1Test {

    @Test
    public void Task1Test() {
        DriverFactory driverFactory = new DriverFactory();
        WebDriver driver = driverFactory.initDriver();

        //WebDriverManager.firefoxdriver().setup();
        //WebDriver driver = new FirefoxDriver();

        driver.get("https://www.onet.pl/");
        driver.quit();
    }


}



