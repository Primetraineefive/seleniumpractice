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
public class TestDragAndDrop extends BaseTest {

    String baseUrl = "https://jqueryui.com/resources/demos/droppable/default.html";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

    @Test
    public void dragAndDropExample(){
        Actions actions = new Actions(driver);

        WebElement draggable = driver.findElement(By.id("draggable"));
        WebElement droppable = driver.findElement(By.id("droppable"));

        actions.dragAndDrop(draggable, droppable).build().perform();
    }
}
