package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class MultipleWindows {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pritam Paul\\Downloads\\demo1\\HandleWindows\\" +
                "src\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/browser-windows");
        Thread.sleep(2000);

        driver.findElement(By.id("windowButton")).click();

        String MainWindow = driver.getWindowHandle();
        System.out.println("Main window handle: " + MainWindow);

        Set<String> allWindows = driver.getWindowHandles();
        System.out.println("Child window handle is" + allWindows);
        Iterator<String> iterator = allWindows.iterator();


        while (iterator.hasNext()) {
            String ChildWindow = iterator.next();
            if (!MainWindow.equalsIgnoreCase(ChildWindow)) {
                driver.switchTo().window(ChildWindow);

            }
        }
    }
}
