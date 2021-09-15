package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivision {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pritam Paul\\Downloads\\demo1\\HandleWindows\\" +
                "src\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.yatra.com/");
        Thread.sleep(1000);

        driver.navigate().to("https://flight.yatra.com/air-search-ui/dom2/trigger?type=O&viewName=normal&flexi=0&noOfSegments=1" +
                "&origin=DEL&originCountry=IN&destination=BOM&destinationCountry=IN&flight_depart_date=15%2F09%2F2021&" +
                "ADT=1&CHD=0&INF=0&class=Economy&source=fresco-home&unqvaldesktop=1259624837222");
        Thread.sleep(1000);

        driver.findElement(By.xpath("//p[@class='bold font-lightgrey fs-8 mt-2 text-uppercase']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//p[contains(text(),'16')]//parent::div[@class='date-holder']")).click();

    }
}
