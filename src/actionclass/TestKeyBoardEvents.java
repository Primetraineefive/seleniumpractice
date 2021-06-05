package actionclass;

import browsertesting.BaseTest;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

/**
 * Created by Jay
 */
public class TestKeyBoardEvents extends BaseTest {

    String baseUrl = "https://courses.letskodeit.com/practice";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

    @Test
    public void keyBoardExample() throws InterruptedException {

        Actions actions = new Actions(driver);
        driver.findElement(By.id("openwindow")).sendKeys(Keys.CONTROL +"a");
        Thread.sleep(2000);

        actions.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();

        clickOnElement(By.id("name"));

        actions.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();

        actions.sendKeys(Keys.chord(Keys.CONTROL+"c")).build().perform();


    }
}
