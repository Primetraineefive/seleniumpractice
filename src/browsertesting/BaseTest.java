package browsertesting;

import org.openqa.selenium.chrome.ChromeDriver;
import utility.Utility;

/**
 * Created by Jay
 */
public class BaseTest extends Utility {

    public void openBrowser(String baseUrl){
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }

    public void closeBrowser(){
        if (driver != null){
            driver.quit();
        }
    }

}
