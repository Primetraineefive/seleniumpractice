package switchwindows;

import browsertesting.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

/**
 * Created by Jay
 */
public class SwitchFrame extends BaseTest {

    String baseUrl = "https://courses.letskodeit.com/practice";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void switchFrameExample() throws InterruptedException {
        // Switch to frame
        driver.switchTo().frame("courses-iframe");

        sendTextToElement(By.xpath("//input[@id='search']"),"Prime");

        driver.switchTo().defaultContent();
        Thread.sleep(3000);
        sendTextToElement(By.id("name"), "Test Successful");

    }

    @After
    public void teardown() throws InterruptedException {
        Thread.sleep(2000);
        closeBrowser();
    }
}
