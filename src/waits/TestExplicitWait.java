package waits;

import browsertesting.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by Jay
 */
public class TestExplicitWait extends BaseTest {

    String baseUrl = "https://courses.letskodeit.com/practice";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void explicitWaitExample() throws InterruptedException {
        By signInLink = By.xpath("//a[contains(text(),'Sign In')]");

        /*WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(signInLink));
        element.click();*/
        WebElement element = waitUntilVisibilityOfElementLocated(signInLink, 10);

       clickOnElement(waitUntilVisibilityOfElementLocated(signInLink, 10));
    }





    @After
    public void teardown() throws InterruptedException {
        Thread.sleep(2000);
        closeBrowser();
    }
}
