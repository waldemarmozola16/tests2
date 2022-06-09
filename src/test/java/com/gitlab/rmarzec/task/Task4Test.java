package com.gitlab.rmarzec.task;

import com.gitlab.rmarzec.framework.utils.DriverFactory;
import com.gitlab.rmarzec.model.YTTile;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;


public class Task4Test {

    @Test
    public void Task4Test(){
        DriverFactory driverFactory = new DriverFactory();
        WebDriver driver = driverFactory.initDriver();
        driver.get("https://www.youtube.com/");
        driver.findElement(By.cssSelector("ytd-button-renderer.style-scope:nth-child(2) > a:nth-child(1) > tp-yt-paper-button:nth-child(1) > yt-formatted-string:nth-child(1)")).click();
        //Lista kafelkow
        //to catch all web elements into list
        //List<WebElement> myList=webDriver.findElements(By.className("#chips"));

        List<WebElement> allElements=driver.findElements(By.cssSelector("#chips"));

        for(WebElement ele :allElements) {
            System.out.println("Name + Number===>"+ele.getText());
            String s=ele.getText();
            s=s.substring(s.indexOf("(")+1, s.indexOf(")"));
            System.out.println("Number==>"+s);
        }

        //myList contains all the web elements
        //if you want to get all elements text into array list
        List<YTTile> ytTileList = new ArrayList<>();
       // List<String> all_elements_text=new ArrayList<>();

        for(int i=0; i<allElements.size(); i++){

            //loading text of each element in to array all_elements_text
            //
            // ytTileList.add(myList.get().getText();

            //to print directly
           //YTTile.

        }

    }
}
