package selectclass;

import browsertesting.BaseTest;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

/**
 * Created by Jay
 */
public class TestDropDown extends BaseTest {

    String baseUrl = "http://way2automation.com/way2auto_jquery/index.php";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

    @Test
    public void dropDownExample(){

        WebElement dropDown = driver.findElement(By.name("country"));

        Select select = new Select(dropDown);
        // Select by value
        select.selectByValue("Jamaica");
//        selectByValueFromDropDown(By.name("country"),"Jamaica");
        // Select by visible text
        select.selectByVisibleText("Iceland");
        // Select by index
        select.selectByIndex(5);

        List<WebElement> countries = select.getOptions();
        System.out.println("Total country " + countries.size());
        for (WebElement element: countries){
            System.out.println(element.getText());
        }

    }
}
