package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTest {
    public static void main(String[] args) {
        String baseUrl = " https://opensource-demo.orangehrmlive.com/";
        //Launch the Chrome browser
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        String title = driver.getTitle();
        System.out.println(title);
        System.out.println("Current URL:" + driver.getCurrentUrl());

        System.out.println("Page source: " + driver.getPageSource());
        driver.findElement(By.name("username")).sendKeys("Sitaram");
driver.findElement(By.name("password")).sendKeys("sitaram123");
driver.close();
    }

}