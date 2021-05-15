package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by Jay
 */
public class LocatorsDemo2 {

    public static void main(String[] args) {
        String baseUrl = "http://automationpractice.com/index.php";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);

        // class name locator
        List<WebElement> sliderList = driver.findElements(By.className("homeslider-container"));
        int size = sliderList.size();
        System.out.println("No of slider image " +size);

        // tagName locator
        int totalLinks = driver.findElements(By.tagName("a")).size();
        System.out.println("Total links " + totalLinks);
    }
}
