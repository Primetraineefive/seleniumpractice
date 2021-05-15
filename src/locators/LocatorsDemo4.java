package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Jay
 */
public class LocatorsDemo4 {

    public static void main(String[] args) {
        String baseUrl = "http://automationpractice.com/index.php";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);

        //driver.findElement(By.xpath("//input[@id = 'search_query_top']")).sendKeys("T-shirts");
        //driver.findElement(By.xpath("//button[@name='submit_search'] ")).click();

        // xpath with or
        //driver.findElement(By.xpath("//input[@id = 'search_query_top' or @name= 'search_query']")).sendKeys("T-shirts");
        //driver.findElement(By.xpath("//button[@name='submit_search' or @class='btn btn-default button-search']")).click();

        // xpath with and
        //driver.findElement(By.xpath("//input[@id = 'search_query_top' and @name= 'search_query']")).sendKeys("T-shirts");
        //driver.findElement(By.xpath("//button[@name='submit_search' and @class='btn btn-default button-search']")).click();

        // xpath with contains()
        driver.findElement(By.xpath("//input[contains(@id, 'top')]")).sendKeys("T-shirts");
        driver.findElement(By.xpath("//input[contains(@name, 'search')]")).click();

        // xpath with starts-with()
        driver.findElement(By.xpath("//input[starts-with(@id,'search_query')]")).sendKeys("T-shirts");
        driver.findElement(By.xpath("//button[starts-with(@name,'submit_')]")).click();

        // xpath with text()
        //driver.findElement(By.xpath("/a[text()='Women']")).click();  // WOMEN tab xpath

        // chained xpath
        driver.findElement(By.xpath("//form[@id='searchbox']//input[@id='search_query_top']")).sendKeys("T-shirts");
        driver.findElement(By.xpath("//form[@id='searchbox']//button[@name='submit_search']")).click();


    }
}
