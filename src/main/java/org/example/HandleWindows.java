package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class HandleWindows {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pritam Paul\\Downloads\\demo1\\HandleWindows\\" +
                "src\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/browser-windows");
        Thread.sleep(2000);

        driver.findElement(By.id("tabButton")).click();
        Thread.sleep(2000);

        String mainWindowHandle = driver.getWindowHandle();
        System.out.println(mainWindowHandle);
        Set<String> allWindowHandles = driver.getWindowHandles();
        Iterator<String> iterator = allWindowHandles.iterator();

        while (iterator.hasNext()) {
            String childWindow = iterator.next();
            System.out.println(childWindow);
            if (!mainWindowHandle.equalsIgnoreCase(childWindow)) {
                driver.switchTo().window(childWindow);

                WebElement text = driver.findElement(By.id("sampleHeading"));
                System.out.println("Heading of child window:  " + text.getText());
            }
        }
    }
}

