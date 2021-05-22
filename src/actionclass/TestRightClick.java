package actionclass;

import browsertesting.BaseTest;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

/**
 * Created by Jay
 */
public class TestRightClick extends BaseTest {

    String baseUrl = "http://swisnl.github.io/jQuery-contextMenu/demo.html";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

    @Test
    public void rightClick(){
        Actions actions = new Actions(driver);

        WebElement button = driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));

        actions.contextClick(button).build().perform();
        clickOnElement(By.xpath("//body[1]/ul[1]/li[3]/span[1]")); // click the copy option
        System.out.println(driver.switchTo().alert().getText());  // capture the text from alert
        driver.switchTo().alert().accept(); // close the alert box

    }
}
