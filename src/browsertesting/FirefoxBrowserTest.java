package browsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.concurrent.TimeUnit;

/**
 * Created by Jay
 */
public class FirefoxBrowserTest {

    public static void main(String[] args) {

        String baseUrl = "https://demo.nopcommerce.com/";
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
        FirefoxOptions capabilities = new FirefoxOptions();
        capabilities.setCapability("marionette", false);
        WebDriver driver = new FirefoxDriver(capabilities);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);

        String title = driver.getTitle();
        boolean verifyTitle = title.equals("nopCommerce demo store");
        boolean verifyTitleContain = title.contains("login");
        System.out.println(verifyTitle);
        System.out.println(verifyTitleContain);
        int length = title.length();
        System.out.println(title.length());

        String pageSource = driver.getPageSource();
        System.out.println(pageSource);

        driver.close();


    }
}
