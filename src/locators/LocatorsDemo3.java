package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Jay
 */
public class LocatorsDemo3 {

    public static void main(String[] args) {
        String baseUrl = "https://www.facebook.com/";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);

        //Tag and Id
        //driver.findElement(By.cssSelector("#email")).sendKeys("prime@gmail.com");
        //driver.findElement(By.cssSelector("input#email")).sendKeys("prime@gmail.com");

        //Tag and Class
        // driver.findElement(By.cssSelector(".inputtext")).sendKeys("Jay@gmail.com");
        //driver.findElement(By.cssSelector("input.inputtext")).sendKeys("Jay@gmail.com");

        // Tag and Attribute
        //driver.findElement(By.cssSelector("input[name= email]")).sendKeys("abc@gmail.com");
        //driver.findElement(By.cssSelector("[name= email]")).sendKeys("abc@gmail.com");

        // Tag class and Attribute
        driver.findElement(By.cssSelector("input.inputtext[data-testid=royal_email]")).sendKeys("Prime@gamil.com");
        driver.findElement(By.cssSelector("input.inputtext[data-testid=royal_pass]")).sendKeys("abc");


    }
}
