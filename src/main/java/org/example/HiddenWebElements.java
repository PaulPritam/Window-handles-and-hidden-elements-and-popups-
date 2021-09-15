package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HiddenWebElements {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pritam Paul\\Downloads\\demo1\\HandleWindows\\" +
                "src\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
        Thread.sleep(1000);

        List<WebElement> element = driver.findElements(By.id("male"));

        System.out.println(element.size());

        for (int i = 0; i < element.size(); i++) {
            int xAxis = element.get(i).getLocation().getX();

            if (xAxis != 0)
            {
                element.get(i).click();
                break;
            }
        }
    }
}
