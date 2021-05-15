package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Jay
 */
public class LocatorsDemo1 {

    public static void main(String[] args) {
        String baseUrl = "http://automationpractice.com/index.php";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);

        // Id and Name locators
        WebElement searchBox = driver.findElement(By.id("search_query_top"));  // Find the element
        searchBox.sendKeys("T-Shirts");   // Action on Element (Type or send the text)

        /*WebElement searchBtn = driver.findElement(By.name("submit_search"));
        searchBtn.click();*/

        driver.findElement(By.name("submit_search")).click();

        // Link Text locator
        // driver.findElement(By.linkText("Printed Chiffon Dress")).click();
        //Partial link text locator
        driver.findElement(By.partialLinkText("Chiffon Dress")).click();
    }
}
