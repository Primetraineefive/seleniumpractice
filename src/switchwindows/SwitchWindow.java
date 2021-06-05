package switchwindows;

import browsertesting.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import java.util.Set;

/**
 * Created by Jay
 */
public class SwitchWindow extends BaseTest {

    String baseUrl = "https://courses.letskodeit.com/practice";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void switchWindowExample() throws InterruptedException {
        // Get the handle
        String parentHandle = driver.getWindowHandle();
        System.out.println("Parent Handle: " + parentHandle);

        // Find open window button and click
        clickOnElement(By.id("openwindow"));

        // Get all handles
        Set<String> handles = driver.getWindowHandles();

        //Switching between handles
        for (String handle : handles) {
            System.out.println(handle);
            if (!handle.equals(parentHandle)) {
                driver.switchTo().window(handle);
                Thread.sleep(2000);
                clickOnElement(By.xpath("//a[contains(text(),'Sign In')]"));
                driver.close();
                break;
            }
            // Switch back to the parent window
            driver.switchTo().window(parentHandle);
            sendTextToElement(By.id("name"), "Test Successful");

        }

    }

    @After
    public void teardown() throws InterruptedException {
        Thread.sleep(2000);
        closeBrowser();
    }
}
