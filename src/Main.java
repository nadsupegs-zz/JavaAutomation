import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        //This is just a test that I can open the chrome browser and close it
        //You must change the file path to wherever your chromedriver.exe is stored
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nadiya\\Documents\\GrandPad\\JavaAutomatedTesting\\JavaAutomation\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        TimeUnit.SECONDS.sleep(5);
        driver.quit();

        //For kicks and giggles
        System.out.println("Hello World");
    }
}